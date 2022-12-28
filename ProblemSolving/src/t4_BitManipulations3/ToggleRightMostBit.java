package t4_BitManipulations3;

public class ToggleRightMostBit {
	public static void main(String[] args) {
		System.out.println(toggleBit(20));
	}
	
	//Approach 1
	//TC = O(c) or O(1)
	public static int toggleBit(int A) {
		int c = 1;
		int temp = A;
		while(A > 0) {
			c++;
			if((A>>1&1)== 1)
				break;
			A = A>>1;
		}
		int val = ((1<<c)-1);
		int ans = temp ^ val;
		return ans;
		//simple answer = A-1
	}
	
	//Approach 2
	//TC = O(1)
	public static int solve(int A) {
		return A-1;
	}
}
