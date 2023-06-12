package java_problems_datastructures;
import java.util.Scanner;


public class SumOfOddNumbers {

	public static void main(String args[]) {
		
		//Take the inputfrom the console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: \n");
		int number = scanner.nextInt();
		
		//create an array to store odd numbers
		int [] oddNumber = new int[number / 2 + 1];
		scanner.close();
		
		//push those odd numbers into an array
		int i = 0;
		long sum = 0;
		for(int odd = 1; odd<=number; odd++) {
			if(odd%2 == 1) {
				oddNumber[i++] = odd;
			}
		}
		
		//Calculating sum of odd through loop
		
		for (i = 0; i <oddNumber.length; i++) {
			sum += oddNumber[i];
		}
		
		//print the sum
		System.out.println("sum of all odd positive integers less than or equal to " + number + " is " + sum);
	}
	
	}
