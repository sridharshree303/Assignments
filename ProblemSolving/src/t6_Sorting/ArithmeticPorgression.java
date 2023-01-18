package t6_Sorting;

import java.util.Arrays;

public class ArithmeticPorgression {
	public static void main(String[] args) {
		int [] A = {2,4,6,8,18,12,16,14,10};
		System.out.println(solve(A));
	}
	
	//TC = O(n log n)
	//SC = O(1)
	public static int solve(int[] A) {
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int dif = A[1]-A[0];
		System.out.println(dif);
		int i=0,j=1;
		while(j<A.length) {
			if((A[j]-A[i]) != dif) {
				return 0;
			}
			i++;
			j++;
		}
		return 1;
	}
}
