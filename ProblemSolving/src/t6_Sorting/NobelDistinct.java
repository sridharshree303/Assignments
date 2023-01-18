package t6_Sorting;

import java.util.Arrays;

public class NobelDistinct {
	 public static void main(String[] args) {
		int[] a= {1,-10,3,-5,5,4};
		System.out.println(solve(a));
	}
	 
	 public static int solve(int[] A) {
		 int n = A.length;
		 //sort the array
		 Arrays.sort(A);
		 //loop and check index == A[i];
		 int count = 0;
		 for(int i=0;i<n;i++) {
			 if(i==A[i]) 
				 count++;
		 }
		 return count;
	 }
}
