package testpackage01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// .next() reads one word until space/enter

		System.out.println("Please enter your name");

		String firstName = scan.nextLine();

		System.out.println(firstName);

		System.out.println("Please enter your last name");

		String lastName = scan.next();

		System.out.println("Your full name is :" + firstName + " " + lastName);

		scan.nextLine();
		
		System.out.println("Enter your full name");
		
		String fullName = scan.nextLine();
		
		System.out.println(fullName);
		
		scan.close();
	}

}
