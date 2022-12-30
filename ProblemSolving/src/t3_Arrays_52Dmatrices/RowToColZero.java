package t3_Arrays_52Dmatrices;

import java.util.ArrayList;

public class RowToColZero {
	public static void main(String[] args) {

	}

	public static int[][] solve(int[][] A) {
		// length of N and M
		int a = A.length;
		int b = A[0].length;

		// counting the rows and cols
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();

		// find the elements
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (A[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}

		// set now to zeros
		for (int i = 0; i < row.size(); i++) {
			int aa = row.get(i);
			int bb = col.get(i);

			for (int x = 0; x < a; x++) {
				A[x][bb] = 0;
			}
			for (int y = 0; y < b; y++) {
				A[aa][y] = 0;
			}
		}

		return A;
	}
}
