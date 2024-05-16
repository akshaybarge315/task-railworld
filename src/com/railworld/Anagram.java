package com.railworld;

import java.util.Arrays;

public class Anagram {
	 public boolean isAnagram(String s, String t) {
		 s.toLowerCase();
	     t.toLowerCase();

	     if(s.length() == t.length()){
	    	 char a1[] = s.toCharArray();
	         char a2[] = t.toCharArray();

	         Arrays.sort(a1);
	         Arrays.sort(a2);

	         if(Arrays.equals(a1, a2)){
	        	 return true;
	         }else{
	        	 System.out.print(a1[0]);
	        	 return false;
	         }
	      }else{
	         return false;
	      }
	 }

	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("bat", "tab"));
	}

}
