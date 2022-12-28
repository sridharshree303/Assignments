package t3_Arrays_3CarryForward;

public class ClosestMinMax {
	public static void main(String[] args) {
		int[] aa = {1,3};
		System.out.println(solve(aa));
	}
	public static int solve(int [] A) {
		//TC = O(n)
		//SC = O(1)
		//find the max and min one loop
		int min = A[0];
		int max = A[0];
		int n= A.length;
		for(int i=1;i<n;i++) {
			if(A[i]<min) {
				min = A[i];
			}
			else if(A[i]>max) {
				max = A[i];
			}
		}
		
		//edge case
		if(min == max) {
			return 1;
		}
		
		//TC = O(n)
		//SC = O(1)
		//check the range
		int maxInd = -1;
		int minInd = -1;
		int ans = n;
		for(int i=0;i<n;i++) {
			int sumRange = n;
			if(A[i]==min) {
				minInd = i;
			}else if(A[i]==max) {
				maxInd = i;
			}
			
			if(A[i]==min && maxInd != -1) {
				sumRange = minInd - maxInd+1;
			}else if(A[i]==max && minInd != -1) {
				sumRange = maxInd - minInd+1;
			}
			
			if(sumRange < ans) {
				ans = sumRange;
			}
		}
		return ans;
	}
}
