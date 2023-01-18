package t6_Sorting;

import java.util.Arrays;

public class NobelDuplicate {
	public static void main(String[] args) {
		int[] A = {1,4,7,7,7,7,8,8,8,9,9,11};
		//int[] A = {0,1,2,2,2,2,4,4 };
		//int[] A = {2,2,3,4,5,5,6,7 };
		System.out.println(solve1(A));
		System.out.println(solve(A));
	}
	
	private static int solve(int [] A) {
		int n = A.length;
		//sort the array
		Arrays.sort(A);
		//loop and count the nobles 
		int ans = 0;
		int less = 0;
		if(A[0]==0)
			ans++;
		for(int i=1;i<n;i++) {
			if(A[i] != A[i-1])
				less = i;
			if(A[i] == less)
				ans++;
		}
		return ans;
	}
	
	//TC = O(n log n)
	//SC = O(1)
	private static int solve1(int[] A) {
		int n = A.length;
		//sort the array - n log n
		
		// loop and check with carry forward approach
		int j =0;
		int d =0;
		int count = 0;
		for(int i=0;i<n;i++) {
			
			if(i>0) {
				if(A[i]!= A[i-1] && A[i] == i) {
					j++;d = 0;
					count++;
				}else if(i>0 && A[i] == A[i-1]) {
					d++;
					if(A[i-d]==i-d) {
						count++;
					}
				}
			}else if(i==0 && A[i] == i) {
				count++;
			}
			
		}
		
		return count;
	}
}
