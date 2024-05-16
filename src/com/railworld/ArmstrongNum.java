package com.railworld;

public class ArmstrongNum {
	
	static int isArmstrongNum(int num, int length) {
		if (num == 0) {
            return 0;
        }

        int digit = num % 10;
        return (int) Math.pow(digit, length) + isArmstrongNum(num / 10, length);
	}

	public static void main(String[] args) {
		
		int  num = 153;
		
		int length = (int) Math.log10(num) + 1;
        int sum = isArmstrongNum(num, length);
		
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
	}

}
