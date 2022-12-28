package t4_BitManipulations2;

public class ToggleIthBit {
	public static void main(String[] args) {
		System.out.println(solve(49,0));
	}
	
	//TC=O(1)
	//SC=O(1)
	public static int solve(int A,int B) {
		int num = 1<<B;
		return A^num;
	}
	
}
