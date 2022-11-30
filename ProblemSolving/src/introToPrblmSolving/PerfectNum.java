package introToPrblmSolving;

public class PerfectNum {
	public static void main(String[] args) {
		System.out.println(solve(28));
		System.out.println(solve2(8));
		System.out.println(solve3(6));
	}
	
	//Using range untill sqrt(n)
	//Time complexity : O(sqrt(N))
	//Space complexity : O(1)
	public static int solve3(int A) {
		int sum = 0;
		for(int i=1; i<Math.sqrt(A); i++) {
			if(A % i == 0){
				if(i==1) {
					sum = sum + i;	
				} else if(i == A/i) {
					sum = sum + i;
				} else {
					sum = sum+i+A/i;
				}
			}
			
		}
		if(sum == A) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//while loop n/2
	//Time Complexity: O(N)
	//Space Complexity: O(1)
	public static int solve2(int A) {
		int sum = 0;
		for(int i=1; i<A/2; i++) {
			if(A % i == 0) {
				sum = sum + i ;
			}
		}
		if(sum == A) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//using range until n-1 (For loop)
	//Time Complexity: O(N)
	//Space Complexity: O(1)
	public static int solve(int A) {
		int sum = 0;
		for(int i=1; i<A; i++) {
			if(A % i == 0) {
				sum = sum + i ;
			}
		}
		if(sum == A) {
			return 1;
		}else {
			return 0;
		}
	}
}
