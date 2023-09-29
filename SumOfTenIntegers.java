package com.code;

//WAP to find sum of 10 integers and print the sum with a proper SOP statement.
//using for loop
public class SumOfTenIntegers {

	public static void main(String args[]) {
		int integers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += integers[i];
		}

		System.out.println("Sum of ten integers: " + sum);
	}
}

//output
//Sum of ten integers: 55
