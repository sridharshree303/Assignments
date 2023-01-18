package t5_Maths;

public class ConcatenateThreeNums {
	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 30;

		System.out.println(solve(A, B, C));
	}

	// TC = O(1)
	// SC = O(1)
	// RUN TIME = 2263
	public static int solve1(int A, int B, int C) {

		int p = Math.min(A, Math.min(B, C));
		int r = Math.max(A, Math.max(B, C));
		int q = A + B + C - p - r;

		String str = p + "" + q + "" + r;
		int ans = Integer.parseInt(str);

		return ans;
	}

	// TC = O(1)
	// SC = O(1)
	// RUN TIME = 2263 ms
	public static int solve(int A, int B, int C) {

		int p = Math.min(A, Math.min(B, C));
		int r = Math.max(A, Math.max(B, C));
		int q = A + B + C - p - r;

		String str = p + "" + q + "" + r;
		int ans = Integer.parseInt(str);

		return ans;
	}
}
