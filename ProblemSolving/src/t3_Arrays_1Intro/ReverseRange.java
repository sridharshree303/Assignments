package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array A of N Integers. Also given are two integers B and C. 
//Reverse the array A in the given range [B,C]
public class ReverseRange {

	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
		while (B < C) {
			int temp = A.get(B);
			A.set(B, A.get(C));
			A.set(C, temp);
			B++;
			C--;
		}
		return A;
	}

	//Time complexity = O(n)
	//space complexity = O(1)
	public ArrayList<Integer> reverseArr(final List<Integer> A) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(A);
		int n = arr.size();
		int i=0, j = n-1;
		
		while(i<n/2) {
			//swapping
			int temp = arr.get(i);
			arr.set(i, arr.get(j-i));
			arr.set(j-i, temp);
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 4);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.addAll(arr);

		System.out.println(solve(ar, 2, 3));
		
//		Reversing the array using while and for loop
//		int n = arr.size();
//		int i = 0, j = n - 1;
//
//		// Time complexity = O(n/2) => O(n)
//		// space complexity = O(1)
//		while (i < n / 2) {
//			// swapping
//			int temp = arr.get(i);
//			arr.set(i, arr.get(j-i));
//			arr.set(j-i, temp);
//			i++;
//		}
//		System.out.println(arr);
//
//		// Time complexity = O(n/2) => O(n)
//		// space complexity = O(1)
//		for (int x = 0; x < n / 2; x++) {
//			int temp = arr.get(i);
//			arr.set(i, arr.get(j-i));
//			arr.set(j-i, temp);
//
//		}
//		System.out.println(arr);
	}
}
