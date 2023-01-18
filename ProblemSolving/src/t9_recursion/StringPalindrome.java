package t9_recursion;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println(solve("NAMAN"));
	}

	public static int solve(String A) {
		int j = A.length();
		int i = 0;
		return isPalindrome(A, i, j-1);
	}

	//TC = O(n)
	//SC = O(n)
	public static int isPalindrome(String A, int i, int j) {
		if(i>=j)
			return 1;
		if(A.charAt(i) != A.charAt(j))
			return 0;
		return isPalindrome(A, i+1, j-1);
	}
}
