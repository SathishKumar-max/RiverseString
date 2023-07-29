package org.str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringWithListIterater {

	 public static void main(String[] args)
	    {
	        String input = "Geeks For";
	        char[] hello = input.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c : hello)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
	        ListIterator<Character> li = trial1.listIterator();
	      
	        while (li.hasNext())
	            System.out.print(li.next());
	    }
	}
