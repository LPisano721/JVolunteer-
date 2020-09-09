// Filename: AssignVolunteer.java
// Written by: Luigi Pisano
// Written on: August 25 2020

// import statement to allow us the use of the util.Scanner
import java.util.Scanner;

// class header
public class AssignVolunteer
{
	// main method header
	public static void main(String[] args)
	// public is an access specifier
	// static means that this method works without instanciating an object of the class
	// void is the method's return type
	// main means that this needs no other classes to run
	// String is a class. Any arguments to this method must be String objects.
	// args is the name of the arguement (used 99% of the time)
	{

		// VARIABLE(s) and CONSTANT(s)
		int donationType;
		String volunteer;
		String message;
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Walter";
		final String ELECTRONICS_PRICER = "Lydia";	
		final String OTHER_PRICER = "Marco";

		// INPUT(s)
		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this? ");
		System.out.print("Enter " + CLOTHING_CODE + " for clothing, or enter " + FURNITURE_CODE + " for furniture, or enter " + ELECTRONICS_CODE + " for electronics, or enter " + OTHER_CODE + " for anything else. >>  ");
		donationType = input.nextInt();

		// while loop to validate the user input to make sure it is within expected range

		while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
		{
			System.out.println("You've entered " + donationType + "which is NOT a VALID donation type!");
		System.out.print("Enter " + CLOTHING_CODE + " for clothing, or enter " + FURNITURE_CODE + " for furniture, or enter " + ELECTRONICS_CODE + " for electronics, or enter " + OTHER_CODE + " for anything else. >>  ");
		donationType = input.nextInt();
		}
		// CALCULATION
		switch (donationType)
		{
			case(CLOTHING_CODE):
			{
			volunteer = CLOTHING_PRICER;
			message = "a clothing donation";
			break;
			}
			case(FURNITURE_CODE):
			{
			volunteer = FURNITURE_PRICER;
			message = "a furniture donation";
			break;
			}
			case(ELECTRONICS_CODE):
			{
			volunteer = ELECTRONICS_PRICER;
			message = "an electronics donation";
			break;
			}
			case(OTHER_CODE):
			{
			volunteer = OTHER_PRICER;		
			message = "another donation type";
			break;
			}
			default:
			{
			volunteer = "INVALID";
			message = "an INVALID donation type";
			break;
			}
		} // end of switch statement

		// OUTPUT(s)
		System.out.println("You have entered " + donationType + ", which is " + message + ".");
		System.out.println("The volunteer who will price this item is " + volunteer + ".");
	}
}