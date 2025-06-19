package testpackage01;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: (m/f)");
		char gender = scan.next().charAt(0);

		System.out.println("Are you rich? (true/false)");
		boolean rich = scan.nextBoolean();

		if (gender == 'm' || gender == 'M') {
			System.out.println("Yaaay, it's a boy!");

			if (rich) {
				System.out.println("Buy a Ferrari");
			} else {
				System.out.println("Play soccer");
			}

		} else if (gender == 'f' || gender == 'F') {
			System.out.println("Oh nooo, it's a girl!");

			if (rich) {
				System.out.println("Buy a LV bag");
			} else {
				System.out.println("Read a book");
			}

		} else {
			System.out.println("Invalid gender");
		}
		
		scan.close();
	}

}
