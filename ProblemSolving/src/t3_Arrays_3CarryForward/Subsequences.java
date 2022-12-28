package t3_Arrays_3CarryForward;

//Closest min max
//given array find the length of smallest sub array which contains
// both min and max of array

public class Subsequences {
	public static void main(String[] args) {
		String A = "ABCGAGG";
		System.out.println(solve(A));
	}
	
	public static int solve(String A) {
		int a = 0;
        int count = 0;
        int mod = (int)Math.pow(10,9)+7;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A'){
                a++;
            }
            else if(A.charAt(i)=='G'){
                count += a;
                count %= mod;
            }
        }
        return count;
	}
}
