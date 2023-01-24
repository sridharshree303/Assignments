package t9_recursion;

public class PowerFuntion {
	public static void main(String args[]) {
		int m = (int)Math.pow(10, 9)+7;
		int A = 71045970	;
		int B = 41535484;
		int C = 64735492;
		System.out.println(power(A,B,C));
	}

	public static int power(int A, int B, int C) {
		
		//Edge Case -10^9 < A < 10^9
		if(A == 0)
			return 0;
		
		if (B == 0) {
			return 1;
		}

		//reusability 
		long temp = power(A,B/2,C);
		temp = (temp * temp) % C;
		
	
		if (B % 2 == 0)
			return (int) temp;
		else {
			return (int) ((A % C * temp % C) + C) % C;
		}
	}
}
