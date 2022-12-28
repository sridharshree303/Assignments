package t4_BitManipulations2;

public class CheckBit {
	public static void main(String[] args) {
		System.out.println(solve2(4,1));
	}
	
	//Approach-1
	//TC = O(1)
	//SC = O(1)
	public static int solve(int a, int b) {
		if(((a >> b)&1) == 1 ) {
			return 1;
		}
		return 0;
	}
	
	//Approach-2
	//TC = O(1)
	//SC = O(1)
	public static int solve2(int A,int B) {
		if((A&(1<<B))!=0) {
			return 1;
		}
		return 0;
	}
}
