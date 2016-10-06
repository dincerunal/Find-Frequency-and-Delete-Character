package com.dincerunal.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author dincerunal
 *
 */
public class StringIslemleri {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
       try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.print("Enter any string: ");
		   String s = br.readLine();
		   String yeniString ="";
		   System.out.print("Enter any number: ");
		   int tekrarSayisi = Integer.valueOf(br.readLine());
		    
		    
   
		    HashMap temp = new HashMap();
		    
		    int l=s.length(); //finding the length of the string
		    temp = Frequency(s, l);
		            
		    yeniString = deleteChar(s, tekrarSayisi, temp);
		    
		    System.out.println(yeniString);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	/**
	 * @param s
	 * @param tekrarSayisi
	 * @param temp
	 * @return
	 */
	private static String deleteChar(String s, int tekrarSayisi, HashMap temp) {

		try {
			// Get a set of the entries
			Set set = temp.entrySet();
			
			// Get an iterator
			Iterator i = set.iterator();
			
			// Change string
			while(i.hasNext()) {
			   Map.Entry me = (Map.Entry)i.next();
   
			   if (!(Integer.valueOf(me.getValue().toString()) < tekrarSayisi)) {
				   s= s.replace(me.getKey().toString(), "");
			   }
			}
			return s;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}


	/**
	 * @param s
	 * @param l
	 * @return
	 */
	private static HashMap Frequency(String s, int l) {
		try {
			char ch;
			HashMap cache = new HashMap();
			
			// Counting frequency of alphabets begins below
			int count=0;
			for(char i=' '; i<='~'; i++)
			    {
			        count = 0;
			        for(int j=0; j<l; j++)
			        {
			            ch=s.charAt(j); //extracting characters of the string one by one
			            if(ch==i) //first checking the whole string for 'a', then 'b' and so on
			            	count++; //increasing count of those aplhabets which are present in the string

			        }
			        if(count!=0)//printing only those alphabets whose count is not '0'
			        {
			            //System.out.println(i+" "+count);
			            cache.put(i, new Integer(count));
			        }
			    }
   
			return cache;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	

}
