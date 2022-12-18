package t1_IntroToPrblmSolving;

public class SqrtNumber {
	public static void main(String[] args) {
		System.out.println(solve(84630800));
//		System.out.println(50);
	}
	
	//Time complexity O(sqrt(n))
	//space complexity O(n)
	public static int solve(int A) {
		for(int i = 0;i <= Math.sqrt(A);i++) {
			if( i*i == A ) {
				return i;
			} 
		}
		return -1;
	}
}
