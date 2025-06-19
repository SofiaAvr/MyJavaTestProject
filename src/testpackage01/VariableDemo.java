package testpackage01;

public class VariableDemo {

	public static void main(String[] args) {

		// Format : ctrl + shift + f

		// Declare a variable

		String firstName;

		// Assign a value

		firstName = "Jennifer";

		System.out.println("My name is --> " + firstName);

		// Declare a variable & Assign a value

		String lastName = "Bourdierd";

		int age = 26;

		System.out.println(firstName + " " + lastName + " " + age);

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		
		System.out.println(age);
		
		
		// Reassign a new value to the age variable
		
		age = age + 3;
		age += 3;
		
		System.out.println(age);
	}

}
