package t9_recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(solve(46));
	}
	
	public static int solve(int A) {
		if(A == 0) {
			return 0;
		}
		int n = A % 10;
		A = A/10;
		System.out.println(n);
		return solve(A)+n;
	}
}