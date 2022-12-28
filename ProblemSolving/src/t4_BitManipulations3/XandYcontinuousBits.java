package t4_BitManipulations3;

public class XandYcontinuousBits {
	public static void main(String[] args) {
		System.out.println(solve(2,3));
		System.out.println(solve2(2,3));
	}
	
	//TC = O(x)
	//Approach 1
	public static int solve(int x, int y) {
		int ans = 0;
		for(int i=y;i<x+y;i++) {
			ans = ans+(1<<i);
		}
		return ans;
		//11000 or XXYYY
	}
	
	//Approach 2
	public static int solve2(int x, int y) {
		//Set x bits 11
		int ans = (1<<x) - 1;
		//left shit y times 11000
		ans = ans << y;
		return ans;
		//return ((1<<x)-1)<<y;
	}
	
}
//Note:
// If x = 2 bits (000011) = 3
// GP of x no's = (2^x)-1  => 2^2 -1 = 3
