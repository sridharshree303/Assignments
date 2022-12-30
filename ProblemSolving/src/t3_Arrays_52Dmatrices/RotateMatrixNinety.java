package t3_Arrays_52Dmatrices;

import java.util.Arrays;

public class RotateMatrixNinety {
	public static void main(String[] args) {
		int[][] aa = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] ab = {{1,2},{3,4}};
		for (int[] a : ab) {
			System.out.print(Arrays.toString(a));
		}

		solve(ab);
	}

	public static void solve(int[][] A) {
		int n = A.length;
		// find the transpose of the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = A[j][i];
				A[j][i] = A[i][j];
				A[i][j] = temp;
			}
		}
		for (int[] a : A) {
			System.out.print(Arrays.toString(a));
		}
	
		// swap the numbers except middle column
		int x = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < x; j++) {
				int na = n - 1 - j;
				int temp = A[i][na];
				A[i][na] = A[i][j];
				A[i][j] = temp;
			}
		}
		for (int[] a : A) {
			System.out.print(Arrays.toString(a));
		}
	}
}
