package t9_recursion;

public class FiboncciSeries {
	public static void main(String[] args) {
		System.out.println(solve(10));
	}

	// TC = O(n)
	// SC = O(n)
	public static int solve(int A) {
		if (A == 0)
			return 0;
		if (A == 1 || A == 2)
			return 1;
		return solve(A - 1) + solve(A - 2);
	}
}
