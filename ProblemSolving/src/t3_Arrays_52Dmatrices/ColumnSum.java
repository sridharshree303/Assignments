package t3_Arrays_52Dmatrices;

import java.util.Arrays;

public class ColumnSum {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };
		int[] aa = solve(a);
		System.out.println(Arrays.toString(aa));
	}

	public static int[] solve(int[][] A) {
		int col = A[0].length;
        int row = A.length;
		int[] aa = new int[col];
		for(int i=0;i<col;i++) {
			int sum = 0;
			for(int j=0;j<row;j++) {
				sum += A[j][i];
			}
			aa[i] = sum;
		}
		return aa;
	}
}
