package t3_Arrays_InterviewPrblms2;

import java.util.Arrays;

public class SumOfEvenIndices {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int b[][] = { { 0, 2 }, { 1, 4 } };
		int ans[] = solve1(a, b);
		System.out.println(Arrays.toString(ans));
	}

	//TC = O(n+q)
	//SC = O(N)
	//Runtime = 2522 ms
	public static int[] solve1(int[] A, int[][] B) {
		int[] ans = new int[B.length];

		// prefix sum of even indices
		int n = A.length;
		int pf[] = new int[n];
		pf[0] = A[0];
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				pf[i] = pf[i - 1];
			} else {
				pf[i] = pf[i - 1] + A[i];
			}
		}

		System.out.println(Arrays.toString(pf));
		// queries
		for (int i = 0; i < B.length; i++) {
			int a = B[i][0];
			int b = B[i][1];
			int sum = 0;
			if (a == 0) {
				sum = pf[b];
			} else {
				sum = pf[b] - pf[a - 1];
			}
			ans[i] = sum;
		}
		return ans;
	}

	// Brute force approach
	// TC = O(n*q)
	// SC = O(n)
	///Run Time = 12200 ms
	public static int[] solve(int[] A, int[][] B) {
		int[] ans = new int[B.length];
		for (int i = 0; i < B.length; i++) {
			int sum = 0;
			int a = B[i][0];
			int b = B[i][1];
			// sum
			for (int j = a; j <= b; j++) {
				if (j % 2 == 0) {
					sum += A[j];
				}
			}
			ans[i] = sum;
		}
		return ans;
	}
}
