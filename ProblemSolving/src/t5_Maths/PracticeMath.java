package t5_Maths;

public class PracticeMath {
	public static void main(String[] args) {
		int A = -40;
		int B = 7;
		
		System.out.println(solve(A, B));
		
	}
	
	private static int solve(int A, int B) {
		int ans = 0;
		ans = A % B;
		
		if(A < 0) {
			ans += B;
		}
		
		return ans;
	}
}
