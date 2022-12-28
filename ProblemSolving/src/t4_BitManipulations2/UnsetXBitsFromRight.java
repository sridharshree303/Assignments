package t4_BitManipulations2;

public class UnsetXBitsFromRight {
	public static void main(String[] args) {
		System.out.println(solve(37,3));
	}
	
	//Approach1
	//TC = O(1)
	//SC = O(1)
	public static int solve(long A, int B) {
		for(int i=0;i<B;i++) {
			int num = 1<<i;
			if((A>>i&1) != 0)
				A = A^num;
		}
		return (int)A;
	}
	
	//Approach2(minimal)
	//TC=O(1)
	//SC=O(1)
	public static int solve2(long A,int B) {
		A = A>>B;
		A = A<<B;
		return (int)A;
	}
}
