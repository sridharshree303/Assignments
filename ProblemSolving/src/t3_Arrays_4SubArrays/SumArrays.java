package t3_Arrays_4SubArrays;

public class SumArrays {
	public static void main(String[] args) {
		int [] ans = {2,9,5};
		System.out.println(solve(ans));
	}

	//TC = O(n^2)
	//SC = O(1)
	public static long solve(int [] A) {
		long sum = 0;
        int n = A.length;
       
        for(int i=0;i<n;i++){
        	int s = 0;
            for(int j=i;j<n;j++){
                s += A[j];
                sum += s;
            }
        }
        return sum;
	}
}
