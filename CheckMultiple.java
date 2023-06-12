package java_problems_datastructures;
import java.util.Scanner;

public class CheckMultiple {
	
	//main method or driver method
	public static void main(String args[]) {
		
		//calling the method
		isMultiple();
	}

	//this method will check whether n is multiple of m
	private static void isMultiple() throws ArithmeticException {
		
		Scanner input = new Scanner(System.in);
		
		int reminder;
		//reads two values from the input
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		
		reminder = value1 % value2;
		
		if (value2 == 0 || value1 == 0 || reminder != 0) {
			System.out.println("entered values either zero;;	OR " + value1 + " not multiple of " + value2);
		} else {
			System.out.println(value1 + " is Multiple of " + value2);
		}
		//close input stream
		input.close();
	}
}
