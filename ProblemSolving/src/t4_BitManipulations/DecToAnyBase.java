package t4_BitManipulations;

public class DecToAnyBase {
	public static void main(String[] args) {
		System.out.println(solve1(14,6));
		System.out.println(solve(1010,2));
	}
	
	public static int solve(int A, int B) {
		//convert integer to an integer Array
		int j = 0; 
		int len = Integer.toString(A).length(); 
		int[] arr = new int[len];                // TC = O(n) SC = O(n)
		while(A!=0) 
		{ 
			arr[len-j-1] = A%10; 
			A=A/10; 
			j++; 
		} 
		
		//print the value
		Integer result = 0;
		int pow = 0;
		for(int i=len-1;i>=0;i--) {           //TC = O(n)
			result += (int) (arr[i]*(Math.pow(B, pow)));
			pow++;
		}
		return result; 
	}
	
	//Optimized solution
	//TC = 0(N)
	//SC = O(1)
	public static int solve1(int A, int B) {
		int j = 0; 
		int opt = 0;
		while(A!=0)   
		{ 
			int last = A%10;
			opt += last*(Math.pow(B, j));
			A=A/10; 
			j++; 
		} 
		return opt;
	}
	
}
