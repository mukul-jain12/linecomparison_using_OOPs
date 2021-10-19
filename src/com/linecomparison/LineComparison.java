//Line comparison using oops

package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter co-ordinates for a line 1: ");
		System.out.println("Enter the value of x1 and y1:");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.println("Enter the value of x2 and y2");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		Integer dis1 = (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : "+dis1);
		
		System.out.println("Enter co-ordinates for a line 2: ");
	    System.out.println("Enter the value of x1 and y1:");
	    int x3 = scanner.nextInt();
	    int y3 = scanner.nextInt();
	
	    System.out.println("Enter the value of x2 and y2");
	    int x4 = scanner.nextInt();
	    int y4 = scanner.nextInt();
	
	    Integer dis2 = (int) Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
	    System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : "+dis2);

		if(dis1.equals(dis2))			//(length_line1.equals(length_line2))
			System.out.println("Both line 1 nad 2 have same length of " + dis1);
		else
			System.out.println("Both have different length");
		
		scanner.close();
	}
}
