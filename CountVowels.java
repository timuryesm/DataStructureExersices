package java_problems_datastructures;
import java.util.Scanner;

public class CountVowels {

	static String string;

	private static void enterString() {

		// read input from the scanner;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sring value: ");
		string = input.nextLine();
		
		// convert to lowercase
		string.toLowerCase();
		// remove all spaces using the replaceAll method 
		string = string.replaceAll("\\s", "");
		input.close();

	}

	private static int countVowels(String s) {

		// set count to zero initially
		int count = 0;

		// convert string to array of characters to find vowels
		char[] charArray = string.toCharArray();

		// check if they match with vowels using for loop

		for (int i = 0; i < string.length(); i++) {

			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {

				count++;

			}

		}

		return count;

	}

	public static void main(String[] args) {

		enterString();

		// print count value

		System.out.println("Total vowels in the string is " + countVowels(string));

	}
}