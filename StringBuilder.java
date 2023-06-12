package java_problems_datastructures;
import java.util.Scanner;

public class StringBuilder {
	static String str;

	private static void enterString() {

		// we will just take input from the scanner don't do any operations on it.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sring value: ");
		str = input.nextLine();

		input.close();

	}

	private static String removePunctuations(String string) {

		/*
		 * replace all method takes two arguments first one is regex pattern in which
		 * you mention pattern applicable to remove all punctions in the string and in
		 * the second argument we pass the which one we want to replace with regex
		 * pattern to remove all punctuations look like below.
		 */
		string = string.replaceAll("\\p{P}", "");

		return string;

	}

	public static void main(String[] args) {

		enterString();
		// print the modified string
		System.out.println("After removing the all punctuations in the string is: " + removePunctuations(str));

	}


}
