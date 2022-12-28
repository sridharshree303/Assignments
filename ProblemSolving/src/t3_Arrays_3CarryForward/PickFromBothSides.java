package t3_Arrays_3CarryForward;

public class PickFromBothSides {
	public static void main(String[] args) {
		int a[] = {5,-2,3,1,2};
		int b = 3;
		System.out.println(solve(a,b));
	}
	
	public static int solve(int[] A, int B) {
		int n= A.length-1;
		int res = 0;
		
		for(int i = 0;i<B;i++) {
			res += A[i];
		}
		int sum = res;
		for(int i=0;i<B;i++) {
			sum -= A[B-1-i];
			sum += A[n-i];
			
			res = Math.max(res, sum);
		}
		return res;
		
	}
}
