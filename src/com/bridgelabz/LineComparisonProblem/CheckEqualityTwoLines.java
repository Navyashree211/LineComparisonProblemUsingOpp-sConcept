package com.bridgelabz.LineComparisonProblem;

import java.util.Scanner;

public class CheckEqualityTwoLines {
	public static void main(String[] args) {

		/*
		 * As a fan of geometry, I want to check equality of two lines based on the end
		 * points,so that I know when two lines are the equal.
		 */
		System.out.println("Welcome to The Line Comparison Computation Program");

		Scanner scanner = new Scanner(System.in);          // here we can use scanner class to take input from user
		System.out.println("Enter x1 of First Point: ");
		int x1 = scanner.nextInt();
		System.out.println("Enter y1 of First Point: ");
		int y1 = scanner.nextInt();
		System.out.println("Enter x2 of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.println("Enter y2 of Second Point: ");
		int y2 = scanner.nextInt();

		System.out.println("Enter x1 of Third Point: ");
		int p1 = scanner.nextInt();
		System.out.println("Enter y1 of Third Point: ");
		int q1 = scanner.nextInt();
		System.out.println("Enter x2 of Forth Point: ");
		int p2 = scanner.nextInt();
		System.out.println("Enter y2 of Forth Point: ");
		int q2 = scanner.nextInt();
		scanner.close();

		Double lenghtOfLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));    //Calculate the length of first line
		Double lenghtOfLine2 = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));    //Calculate the length of second line

		System.out.printf("Length of First Line is : %.2f %n", lenghtOfLine1);           // here we can use %2f %n to print only two digit after point.
		System.out.printf("Length of Second Line is : %.2f %n", lenghtOfLine2);

		boolean ans = lenghtOfLine1.equals(lenghtOfLine2);          //check here two line are equal or not .
		if (ans) {
			System.out.println("Both Lines are Equal");
		} else {
			System.out.println("Both Lines are not Equal ");
		}
	}

}
