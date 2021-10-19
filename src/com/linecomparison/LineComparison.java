//Line comparison using oops

package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	//main method
	public static void main(String args[]) {

		
		Integer lengthOfLine1 = (int) computeLength();
		Integer lengthOfLine2 = (int) computeLength();
		
		//objects of compareto and equals method
		CompareToMethod compareMethod = new CompareToMethod(lengthOfLine1, lengthOfLine2);
		EqualMethod equalMethod = new EqualMethod(lengthOfLine1, lengthOfLine2);
		
	}

	//length computation method
	public static double computeLength() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter co-ordinates for a line 1: ");
		System.out.println("Enter the value of x1 and y1:");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();

		System.out.println("Enter the value of x2 and y2");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		double lengthOfLine = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

		return lengthOfLine;
	}
}

//compare method class
class CompareToMethod{
	
	//constructor
	public CompareToMethod(Integer lengthOfLine1, Integer lengthOfLine2) {
		
		System.out.println("Compare To Method Result:");
		int res = lengthOfLine1.compareTo(lengthOfLine2);

		//comparing line
		if(res < 0)
			System.out.println("Line 1 is smaller than Line 2.");
		else if(res > 0)
			System.out.println("Line 1 is greater than Line 2.");
		else
			System.out.println("Line 1 is equals to the Line 2.");
		
		System.out.println("");
	}
}

//equals method class
class EqualMethod{
	
	//constructor
	public EqualMethod(Integer lengthOfLine1, Integer lengthOfLine2) {
		System.out.println("Equals Method Result:");
		if(lengthOfLine1.equals(lengthOfLine2))
			System.out.println("Both line 1 nad 2 have same length of " + lengthOfLine1);
		else
			System.out.println("Both have different length");
	}
}