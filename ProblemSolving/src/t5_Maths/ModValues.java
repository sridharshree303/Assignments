package t5_Maths;

public class ModValues {
	public static void main(String[] args) {
		int A = -40;
		int B = 7;
		System.out.println(returnMod(A, B));

		int X = 76277;
		int Y = 376;
		int Z = 2417;
		System.out.println(solve(X, Y, Z));
	}

	// return the mod value of - and = values
	private static int returnMod(int A, int B) {
		int ans = 0;
		if (A < 0) {
			ans = A % B + B;
		} else {
			ans = A % B;
		}
		return ans;
	}

	// TC = O(n)
	// SC = O(1)
	public static int solve(int A, int B, int C) {

		long ans = 1;
		int K = A % C;
		for (int i = 1; i <= B; i++) {
			ans = ((ans) * (K)) % C;
		}

		return (int) ans;
	}
}
