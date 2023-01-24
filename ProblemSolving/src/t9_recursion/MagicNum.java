package t9_recursion;

public class MagicNum {
	public static void main(String[] args) {
//		System.out.println(sum(83557));//28
//		System.out.println(recursive(1291));
		System.out.println(check(83557));
	}
	
	public static int check(int A) {
		if(A == 1) 
			return 1;
		else if(A == 0 || (A > 1 && A < 10))
			return 0;
		else
			return check(recursive(A));
	}
	
	//TC = O(n)
	//SC = o(n)
	public static int sum (int A) {
		if(A == 0)
			return 0;
		int rem = A%10;
		return sum(A/10)+rem;
	}
	
	//TC = O(logn)
	//SC = O(n)
	public static int recursive(int A) {
		if(A >= 0 && A < 10) {
			return A;
		}
		int a = sum(A);
		return recursive(a);
	}
}
