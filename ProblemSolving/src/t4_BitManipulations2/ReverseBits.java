package t4_BitManipulations2;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(solve(3));
	}
	
	public static long solve(long A) {
		
		//Using Math
//		long res = 0;
//		int i=1;
//		while(A > 0) {
//			if((A%2)==1) {
//				res += (long)Math.pow(2, 32-i);
//			}
//			i++;
//			A = A/2;
//		}
//		return res;
		
		//Using BitManipulation
		long ans = 0l;
        for(int i=0; i<32; i++){
            if(((A>>i) & 1) == 1) {
                ans += Math.pow(2, 31-i);
            }
        }
        return ans;
	}
}
