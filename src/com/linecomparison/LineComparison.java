//Line comparison using oops

package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter co-ordinates for a line: ");
		System.out.println("Enter the value of x1 and y1:");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.println("Enter the value of x2 and y2");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		double dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : "+dis);
		
		scanner.close();
	}
}
