package java_problems_datastructures;

/* initialize array with random numbers
        
   step 1: initilize smallestNumber and largestNumber point to zeroth index
   as smallestNumber = array[0]
   largestNumber = array[1]
   step 2: run array thruogh for loop()
   step 3: update smallestNumber and largestNumber in each loop
   like if array[i] > largest
   set largest to array[i]
        
   if array[i] < smallest
   set smallest to array[i]
   step 4:  print(smallest, largest)*/

public class SmallestAndLargestNumber {
	
	// Driver method
		public static void main(String args[]) {

	        // declare an array
			int[] arrayOfIntegers = { 234, 34, 45, 243, 545,-89, 54, 890, 3434, 9, 9843, 5, 453 };
	        // call the method
			smallestAndLargest(arrayOfIntegers);

		}

		private static void smallestAndLargest(int[] array) {
	        // point both values to first index of the array
			long smallestNumber = array[0];
			long largestNumber = array[0];

			for (int i = 1; i < array.length; i++) {

	            // if we find smaller/greater than that, update the variable
				if (array[i] <= smallestNumber)
					smallestNumber = array[i];
				else if (array[i] >= largestNumber)
					largestNumber = array[i];

			}
	        // print both values
			System.out.print("smallest number is: " + smallestNumber + "\n");
			System.out.print("largest number is: " + largestNumber);

		}

}
