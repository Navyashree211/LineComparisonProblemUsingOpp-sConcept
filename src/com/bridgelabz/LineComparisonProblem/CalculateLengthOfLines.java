package com.bridgelabz.LineComparisonProblem;

import java.util.Scanner;

public class CalculateLengthOfLines {

	/*
	 * As a fan of geometry, I want to model a lien based on a point consisting of
	 * (x,y) co-ordinates using the Cartesian system, so that I can Calculate its
	 * length.
	 */
	public static void main(String[] args) {
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
		scanner.close();

		double lenghtOfLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));     //Calculate the length of lines.
		System.out.printf("Length of Line is : %.2f %n", lenghtOfLine);                //%.2f %n to print only two digit after point 

	}
}
