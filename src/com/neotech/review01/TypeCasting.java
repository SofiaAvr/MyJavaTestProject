package com.neotech.review01;

public class TypeCasting {
	public static void main(String[] args) {
		
		// byte - short - int - long - float - double
	
	int intNumber = 39;
	
	//widening - implicit casting - automatically
	
	double doubleNumber = intNumber;
	
	System.out.println(intNumber);
	System.out.println(doubleNumber);
	
	//narrowing - explicit casting - manually
	
	byte byteNumber = (byte) intNumber; // we may lose date
	
	System.out.println(byteNumber);
	
	intNumber = 300;
	
	byte b2 = (byte) intNumber;
	
	System.out.println(b2);
	}

}
