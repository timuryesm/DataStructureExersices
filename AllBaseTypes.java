package java_problems_datastructures;

import java.util.Scanner;

public class AllBaseTypes {
	
	private static void checkAllBaseTypes() {
		//This method will ask you to input all base types of data
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		//check whether entered data is valid or not using while loop
		/*
		 * we will do same for all the input types check the next entered input using
		 * associated method such as hasNextInt(), hasNextShort()... only enter into
		 * the block only when while condition is true.
		 */
		
		while(!input.hasNextByte()) {
			System.out.println("please enter valid byte value ");
			input.next();
		}
		System.out.println("you entered a byte value " + input.nextByte() + "\n");
		
		System.out.println("please enter short value: ");
		while(!input.hasNextShort()) {
			System.out.println("please enter valid short value: \n ");
			input.next();
		}
		System.out.println("entered short is " + input.nextShort());
		input.next();
		
		System.out.println("Enter an integer: ");
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Please enter valid integer: ");		
	}
		System.out.println("Entered Integer value is : " + input.nextInt());

		System.out.print("Enter a float : ");
		while (!input.hasNextFloat()) {
			input.next();
			System.out.println("Please enter valid float : ");
		}
		System.out.println("Entered float value is " + input.nextFloat());

		System.out.print("Enter a long: ");
		while (!input.hasNextLong()) {
			input.next();
			System.out.println("Please enter valid long vzlue: ");
		}
		System.out.println("Entered long value is : " + input.nextLong());

		System.out.print("Enter a double: ");
		while (!input.hasNextDouble()) {
			input.next();
			System.out.println("Please enter valid double value : ");
		}
		System.out.println("Entered double value is  : " + input.nextDouble());

		System.out.print("Enter a boolean: ");
		while (!input.hasNextBoolean()) {
			input.next();
			System.out.println("Please enter boolean value: ");
		}
		System.out.println("Entered boolean value is : "+input.nextBoolean());

		System.out.print("Enter a character ");
		char c = input.next().charAt(0);
		System.out.println("Entered character is : " + c);
		input.close();
}
	//Driver method
	public static void main(String args[]) {
		
		
		//calling the method
		checkAllBaseTypes();
	}

}
