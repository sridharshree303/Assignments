package t3_Arrays_52Dmatrices;

public class MinorDiagnol {
	public static void main(String[] args) {
		int[][] a = { { 3, 2 }, { 2, 3 } };
		System.out.println(solve(a));
	}

	public static int solve(final int[][] A) {
		int i = 0;
		int n = A.length;
		int j = n - 1;
		int sum = 0;
		while (i <n) {
			sum += A[i][j];
			i++;
			j--;
		}
		return sum;

	}
}
