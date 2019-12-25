package smallestPov;
import java.util.*;


public class MyClass {
	
	public static void main(String[] args) {
		//Create your own array of integers (negative values allowed)
		int[] A = {9, 2, 3, 10};
		
		
		//Creates an array of random positive integers
	/*	Random rnd = new Random();
		rnd.setSeed(123456789);
		int[] A = new int[10];
		//Create new array of random integers
		for(int i = 0; i < A.length; i++) {
			A[i] = rnd.nextInt(10) + 1;
			System.out.print(A[i]);
		}
	*/	
		
		int temp = A[0];
		//Find smallest positive number in the array
		for(int i = 0; i < A.length-1; i++) {
			if(A[i+1] < temp) {
				temp = A[i+1];
			}
		}
		if(temp < 0 || temp > 1) {
			temp = 1;
		}
		
		//Determines whether your smallest value is in the array and whether
		//its negative
		boolean a =  true;
		while(a) {
			for(int i = 0; i < A.length; i++) {
				if(temp == A[i]) {
					a = true;
					temp++;
					break;
				}
				else {
					a = false;
				}
			}
		}
		
		//print out result
		System.out.print("\n" + temp);
	}
}
