package t4_BitManipulations2;

public class SetBit {
	public static void main(String[] args) {
		System.out.println(solve2(4, 4));
	}

	// Approach-1
	// TC = O(1)
	// SC = O(1)
	public static int solve(int A, int B) { //OR
		int num = 1 << A;
		if (A == B)
			return num;
		return num | (1 << B);
	}

	// Approach-2
	// TC = O(1)
	// SC = O(1)
	public static int solve2(int A, int B) { //XOR
		int num = 1 << A;
		int numb = 1 << B;
		if (num == numb)
			return num;
		return num ^ numb;

	}
}
