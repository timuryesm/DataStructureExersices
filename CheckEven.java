package java_problems_datastructures;
import java.util.Scanner;

public class CheckEven {
	
	/* use for loop to check if it is even number or not
	   by default set isItEven variable to false
	   start the loop with i value 1
	   it change the value of boolean variable every time it entered the loop.
	   fixes the variable when for loop terminates
	*/
	
	public static boolean isEven (long value) {
		boolean isItEven = false;
		for (int i=1; i<value; i++) 
			isItEven = !isItEven;
			
		return isItEven;
	}
	
	public static void main(String args[]) {
		
		//take input from the user
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		Long userInput = input.nextLong();
		
		boolean check = isEven(userInput);
		
		if(check == true) {
			System.out.println(+userInput + " is even number");
		} else {
			System.out.println(+userInput + " is not an even number");
		}
		input.close();
		
		}

}
