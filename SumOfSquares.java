package java_problems_datastructures;
import java.util.Scanner;

public class SumOfSquares {

	static int number;
	long sum;

	private void takeInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number ");
		number = scanner.nextInt();
		scanner.close();

	}
   // calculate the sum of square of integers
	private long sumOfSquareIntegers(int n) {

		for (int i = 0; i <= number; i++) {
			sum += (i * i);
		}
		return sum;

	}

	public static void main(String[] args) {

		SumOfSquares squares = new SumOfSquares();
		squares.takeInput();
		System.out.println("sum of squares of all positive integers less than or equal to " + number +" is: "+ squares.sumOfSquareIntegers(number));

	}
}
