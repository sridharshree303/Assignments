package t3_Arrays_4SubArrays;

public class SubArraysDivibleByN {
	public static void main(String[] args) {
		int A[] = {-3,6,2};
		System.out.println(solve(A,3));
	}
	
	public static long solve(int[] A, int B) {
		
		if(A.length == 0)
			return 0;
		int n = A.length;
		long count = 0;
		
		for(int i=0;i<n;i++) {
			long sum = 0;
			for(int j=i;j<n;j++) {
				sum += A[j];
				if(sum %B == 0)
					count++;		
			}
		}
		return count;
	}
}
