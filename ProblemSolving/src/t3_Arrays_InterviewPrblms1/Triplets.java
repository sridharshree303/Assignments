package t3_Arrays_InterviewPrblms1;

public class Triplets {
	public static void main(String[] args) {
		int[] a = {1,2,4,3};
		System.out.println(solve(a));
	}
	
	//TC = O(n*n)
	//SC = O(1)
	public static int solve(int[] arr) {
		int ans = 0;
		int n = arr.length;
		
		//counting by using loop
		for(int i = 1;i<n-1;i++) {
			int left = 0;
			int right = 0;
			//check left
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]) {
					left++;
				}
			}
			//check right
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					right++;
				}
			}
			
			//count the triplets
			ans += left*right;
		}
		
		return ans;
	}
}
