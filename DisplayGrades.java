package com.code;

import java.util.Scanner;

//Write a Java switch case program to take the students names and marks of 10 students as input and display their grades according to the below conditions:
//* If marks above 90 then “A” grade
//* If marks between 90-80 then “B” grade
//* If marks between 80-70 then “C” grade
//* If marks between 70-60 then “D” grade
//* If marks between 45-60 then “E” grade 
//* Else “F”
public class DisplayGrades {

	public static void main(String args[]) {

		String name[] = new String[10];
		int marks[] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter " + (i + 1) + " Student name :");
			name[i] = sc.nextLine();

			System.out.println("Enter " + (i + 1) + " Student marks :");
			marks[i] = sc.nextInt();

			sc.nextLine();

		}

		for (int i = 0; i < 10; i++) {
			int mark = marks[i];

			switch (mark / 10) {
			case 10:
			case 9:
				System.out.println("Grade A");
				break;
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
				System.out.println("Grade C");
				break;
			case 6:
				System.out.println("Grade D");
				break;
			case 5:
			case 4:
				System.out.println("Grade E");
				break;
			default:
				System.out.println("Grade F");
				break;
			}

		}
		
		sc.close();
	}
}

//Output
//
//Enter 1 Student name :
//Aniket
//Enter 1 Student marks :
//100
//Enter 2 Student name :
//b
//Enter 2 Student marks :
//99
//Enter 3 Student name :
//c
//Enter 3 Student marks :
//88
//Enter 4 Student name :
//d
//Enter 4 Student marks :
//77
//Enter 5 Student name :
//e
//Enter 5 Student marks :
//66
//Enter 6 Student name :
//f
//Enter 6 Student marks :
//55
//Enter 7 Student name :
//g
//Enter 7 Student marks :
//88
//Enter 8 Student name :
//r
//Enter 8 Student marks :
//67
//Enter 9 Student name :
//e
//Enter 9 Student marks :
//97
//Enter 10 Student name :
//e
//Enter 10 Student marks :
//75
//Grade A
//Grade A
//Grade B
//Grade C
//Grade D
//Grade E
//Grade B
//Grade D
//Grade A
//Grade C
//
