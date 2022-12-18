package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array A of size N and an integer B,you have 
//to return the same array after rotating it B times towards the right.
public class ArrayRotation {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList( 7, 4, 2, 10, 5,9,3,6,8);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.addAll(arr);
		System.out.println(solve(ar,7));
		
	}
	
	//k < n
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		int n = A.size();
		B = B % n;
		A = reverseArray(A, 0, n-1);
		
		A = reverseArray(A, B, n-1);
		
		A = reverseArray(A, 0, B-1);
		
		return A;
	}
	
	public static ArrayList<Integer> reverseArray(ArrayList<Integer> A, int B, int C) {
		while (B < C) {
			int temp = A.get(B);
			A.set(B, A.get(C));
			A.set(C, temp);
			B++;
			C--;
	
		}
		return A;
	}
}
