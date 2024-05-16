package com.railworld;

public class FactorialNum {
	
	public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int Fnm1 = factorial(n-1);
        int fac = n * Fnm1;
        return fac;
    }

	public static void main(String[] args) {
		System.out.println(factorial(4));;
	}

}
