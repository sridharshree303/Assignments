package t6_Sorting;

import java.util.Arrays;

public class CostOfElements {
	public static void main(String[] args) {
		int[] A = {1,3,4,2};
		System.out.println(solve(A));
		System.out.println(solve1(A));
	}
	
	public static int solve1(int[] A) {
		//sort the array
		Arrays.sort(A);
		
		//loop and calculate the array
		int ans = 0;
		int n = A.length;
		for(int i=0;i<n;i++) {
			ans += (A[i]*(n-i));
		}
		return ans;
	}
	
	//TC = O(n log n)
	//SC = O(1)
	public static int solve(int[] A) {
		int n = A.length;
		//sort the array
		Arrays.sort(A);
		
		//find the sum
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += A[i];
		}
		
		//return the ans
		int ans = 0;
		for(int i=n-1;i>=0;i--) {
			ans += sum;
			sum -= A[i];
		}
		return ans;
    }
	
	
}
