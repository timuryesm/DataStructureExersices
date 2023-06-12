package java_problems_datastructures;

public class Testarray2 {
	public static void main(String args[]) {
		int A[] = {33,3,4,450,120};
		A[4] = 550;
		int B[] = A.clone();
		for(int i = 0; i<A.length; i++) 
			System.out.println(A[i]);
		for(int i = 0; i<B.length; i++) 
			System.out.println(B[i]);
	}
}
