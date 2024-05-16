package com.railworld;

public class ConvertDollar {
	
	public static void main(String[] args) {
		String numStr = "$2000";
		String n = numStr.substring(1);
		int num = Integer.parseInt(n); 
		System.out.println("Incremented number: $" + Integer.toString(num + 1));
	}

}
