package java_problems_datastructures;
import java.util.Scanner;

public class SumOfIntegers {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = input.nextInt();
		
		System.out.println("sum of all positive integers is: " + sumOfIntegers(n));
		
		input.close();
		
	}

	//Calculate sum of integers
	private static int sumOfIntegers(int n) {
		
		//n*(n+1)/2 gives sum of n integers.
		
		int sum = n * (n+1) / 2;
		return sum;
	}
}