package com.neotech.review01;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		double d1 = scan.nextDouble();
		
		System.out.println("Please enter the second number");

		double d2 = scan.nextDouble();
		
		System.out.println("Please enter the operator");
		
		String op = scan.next();
		
		scan.close();
		
		if (op.equals("+")){
			System.out.println("The result : " + (d1 + d2));
		} 
		else if ( op.equals("-")) {
			System.out.println("The result : " + (d1 - d2));
		}
		else if ( op.equals("*")) {
			System.out.println("The result is  " + (d1*d2) );
		}
		else if ( op.equals("/")) {
			System.out.println("The result is  " + (d1/d2) );
		}
		else {
			System.out.println("Invalid Operator");
		}
		
		scan.close();
	}

}
