package t1_IntroToPrblmSolving;

public class IsPrime {
	public static void main(String[] args) {
		System.out.println(solve((long) 123));
		System.out.println(solve2((long) 101));
	}
	
	// this is an approach for finding prime.
	public static int solve2(Long A) {
		if ( A <= 1) {
			return 0;
		}
		
		for(int i=2; i < A; i++) {
			if( A % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	// finding the number of factors and then it returns the isPrime or not
	public static int solve(Long A) {
		int count = 0;
		for(int i = 1; i <= Math.sqrt(A); i++) {
			if(A % i == 0) {
				if(i == A/i) {
					count++;
					break;
				}else {
					count = count+2;
					//System.out.println(count+" - "+ i);
				}
			}
		}
		if(count <= 2) {
			return 1;
		}
		return 0;
	}
}
