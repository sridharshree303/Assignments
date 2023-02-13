package t4_BitManipulations;

public class AnyBaseToDec {
	public static void main(String[] args) {
		System.out.println(solve(13,2));
	}
	
	//Convert any decimal to Base
	public static int solve(int A, int B) {
		int j=0;
		int opt = 0;
		while(A>0) {
			int val = A%B;
			opt += val * (int)(Math.pow(10,j)) ;
			j++;
			A= A/B;
		}
		return opt;
	}
	
	//solve(12,3) -- 110
	//solve(13,2) -- 1101
}
