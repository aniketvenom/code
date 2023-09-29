package com.code;

import java.util.Scanner;

//WAP to find sum of 10 integers and print the sum with a proper SOP statement.
//using for loop
public class SumOfTenIntegers {

	public static void main(String args[]) {

		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// declaring an array of size 10
		int integers[] = new int[10];

		// delcaring sum as 0
		int sum = 0;

		// taking input of integer from user
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter " + (i + 1) + " integer");
			integers[i] = sc.nextInt();
		}

		// adding ten integers using for loop
		for (int i = 0; i < 10; i++) {
			sum += integers[i];
		}

		// printing the output
		System.out.println("Sum of ten integers: " + sum);

		// closing the scanner
		sc.close();
	}
}


//Output
//Enter 1 integer
//12
//Enter 2 integer
//23
//Enter 3 integer
//21
//Enter 4 integer
//43
//Enter 5 integer
//67
//Enter 6 integer
//54
//Enter 7 integer
//34
//Enter 8 integer
//32
//Enter 9 integer
//45
//Enter 10 integer
//2
//Sum of ten integers: 333
