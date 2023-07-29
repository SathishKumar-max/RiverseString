package org.str;

public class StringSwappingMethod {

	 public static void main(String[] args)
	    {
	        String input = "Geeks For Geeks";
	        char[] ch = input.toCharArray();
	        int left, right = 0;
	        right = ch.length - 1;
	 
	        for (left = 0; left < right; left++, right--) {
	           
	        	// Swap values of left and right
	           
	        	char ch1 = ch[left];
	            ch[left] = ch[right];
	            ch[right] = ch1;
	        }
	 
	        for (char c : ch)
	            System.out.print(c);
	    }
	}
