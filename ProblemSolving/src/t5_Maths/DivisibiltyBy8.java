package t5_Maths;

public class DivisibiltyBy8 {
	public static void main(String[] args) {
		String A = "40897237111816995922805307737859413552091006"
				+ "5149276038478831301247467567674262378493964800877"
				+ "33429432861339411285568084588535007444160";
		System.out.println(solve1(A));
	}
	
	//for 8 divisible values last 3 values of a number mod is zero
	//Then the total number should be divisible by the 8
	
	//TC = O(1)
	//SC = O(1)
	//Math solution
	public static int solve(String A) {
		//Substring the last 3 numbers
		int n = A.length();
		String sub = A.substring(n-3, n);
		
		//change it to int and check the mod
		int val = Integer.parseInt(sub);
		if(val%8==0)
			return 1;
		return 0;
	}
	
	//TC = O(N)
	//SC = O(1)
	//Iterative solution
	public static int solve1(String A) {
		long ans = 0;
		int n = A.length()-1;
		int exp = 1;
		
		for(int i=n;i>=0;i--) {
			ans = ((ans)%8 + (A.charAt(i)*(exp%8))%8)%8;
			exp = (exp*10)%8;
		}
	
		if(ans%8 == 0) 
			return 1;
		return 0;
	}
}
