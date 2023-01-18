package t5_Maths;

public class DivisibiltyBy3 {
	public static void main(String[] args) {
		int A[] = { 1, 0, 1, 1, 3 };
		System.out.println(solve1(A));
	}

	// TC =O(n)
	// SC = O(1)
	public static int solve(int[] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		if ((sum % 3) == 0)
			return 1;
		return 0;
	}
	
	
	//TC = O(N)
	public static int solve1(int[] A) {
		long ans = 0;
		
		for(int i=0;i<A.length;i++) {
			ans = ((ans)%3 + A[i]%3)%3;
		}
		
		if(ans%3==0) 
			return 1;
		return 0;
	}
}
