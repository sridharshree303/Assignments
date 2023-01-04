package t3_Arrays_InterviewPrblms1;

public class ChristmasTrees {
	public static void main(String[] args) {
//		int []A = {1,3,5};
//		int []B = {1,2,3};
		int []A = {5, 9, 10, 4, 7, 8};
		int []B = {5, 6, 4, 7, 2, 5};
		System.out.println(solve(A,B));
		
	}
	
	//TC = O(n) or Nearly O(N*N)
	//SC = O(1)
	public static int solve(int[] A, int[] B) {
		int n = A.length;
		int sum = 0;
		int ans = Integer.MAX_VALUE;
		int valid = 0;
		
		for(int i=1;i<n;i++) {
			
			int minLeft = Integer.MAX_VALUE;
			int minRight = Integer.MAX_VALUE;
			int count1 = 0;
			int count2 = 0;
			
			//left side
			for(int j=i-1;j>=0;j--) {
				if(A[j]<A[i] && B[j]<minLeft) {
					minLeft = B[j];
					count1++;
				}
			}
			
			//right side
			for(int j=i+1;j<n;j++) {
				if(A[j]>A[i] && B[j]<minRight) {
					minRight = B[j];
					count2++;
				}
			}
			
			valid += (count1*count2);
			sum = minLeft+minRight+B[i];
			//System.out.println(sum+"=="+minLeft+"=="+minRight+"--"+B[i]);
			if(sum > 0 )
				ans = Math.min(ans, sum);
		}
		if(valid == 0) {
			return -1;
		}
		return ans;
	}
}
