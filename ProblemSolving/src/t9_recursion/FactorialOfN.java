package t9_recursion;

public class FactorialOfN {
	public static void main(String[] args) {
		System.out.println(facts(4));
	}
	
	//TC = O(n)
	//SC = O(n)
	public static int facts(int n) {
		if(n == 1 || n == 0)
			return 1;
		return facts(n-1)*n;
	}
}
