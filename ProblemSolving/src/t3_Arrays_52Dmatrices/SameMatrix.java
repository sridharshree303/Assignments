package t3_Arrays_52Dmatrices;

public class SameMatrix {
	public static void main(String[] args) {

	}

	// check two same matrices A and B
	//if not return 0 else 1;
	public int solve(int[][] A, int[][] B) {
		int n = A.length;
		int m = A[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i][j] != B[i][j])
					return 0;
			}
		}
		return 1;
	}
}
