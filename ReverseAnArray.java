package java_problems_datastructures;

/*step 1: initilize array using new int[] { }
*step 2:    use for loop to print orginal array
*     for int i = 0; i < arraylength; i increment
*step 3:     print the array using print command
*   print array in reverse order
*    
*step 4:    run the array in loop
*step 5:    inilizie i to point last element in the array
*    for int i = arraylength-1; i >= 0 ; i decrement
*step 6:    print the array*/

public class ReverseAnArray {

	// initialize array
		static int[] arrayOfIntegers = {2,5,8,56,23,9,11};
		   
		   // Driver method
		   public static void main(String args[]) {
		         
			     // call the method
		         reverseArray(arrayOfIntegers);

		   }

		   public static void reverseArray(int[] arr) {
			   
			   	   // Print the array as it is 
		           System.out.println("Array before reverse operation : ");
		           for(int i = 0 ; i < arrayOfIntegers.length; i++) {
		           System.out.print(arrayOfIntegers[i] + " ");
		          
		           }
	               // Print the array reading from last index first
		           System.out.println(" \nArray after reverse operation : ");
		           for(int i = arrayOfIntegers.length-1 ; i>= 0 ; i--) {
		           System.out.print(arrayOfIntegers[i]+ " ");
		           }

		   }
}
