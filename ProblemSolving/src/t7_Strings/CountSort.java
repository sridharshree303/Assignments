package t7_Strings;

import java.util.Arrays;

public class CountSort {
	public static void main(String[] args) {
		int[] aa = {3,2,4,1,1,4,9};
		int[] ans = solve(aa);
		System.out.println(Arrays.toString(ans));
	}

	//TC = O(N)
	//SC = o(N)
	public static int[] solve(int[] A) {
		//find the max value
		int n = A.length;
		int max = Integer.MIN_VALUE;
		//TC =O(n)
		for(int i=0;i<n;i++) {
			if(A[i] > max) {
				max = A[i];
			}
		}
		//Create count array with max+1 size
		int[] c = new int[max+1];
		System.out.println(Arrays.toString(c));
		//count the Frequency
		//TC = O(n)
		for(int i=0;i<n;i++) {
			int index = A[i];
			c[index]++;
		}
		
		System.out.println(Arrays.toString(c));
		//print the frequency
		//TC = O(n)
		int idn = 0;
		for(int i=0;i<c.length;i++) {
			int count = c[i];
			for(int j=0;j<count;j++) {
				A[idn] = i;
				idn++;
			}
		}
		return A;
	}
}
