package org.str;

public class UsingArrayMethod {

	 public static void main(String[] args)
	    {
	        String input = "sathish";
	 
	        char[] ch = input.toCharArray();
	        for (int i = ch.length - 1; i >= 0; i--)
	            System.out.print(ch[i]);
	        
	        // convert String to character array
	           // by using toCharArray
	    }
	}
