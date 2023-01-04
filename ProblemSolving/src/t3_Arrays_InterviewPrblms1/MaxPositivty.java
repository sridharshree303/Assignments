package t3_Arrays_InterviewPrblms1;

import java.util.Arrays;

public class MaxPositivty {
	public static void main(String[] args) {
		int a[] = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};
		int[]A= solve(a);
		System.out.println(Arrays.toString(A));
	}
	
	//TC = O(n)
	//SC = O(n)
	public static int[] solve(int[]A) {
		int maxSize = 0;
		int n = A.length;
		int arr[] = new int[2];
		
		//Looping the array
		for(int i=0;i<n;i++) {
			//If negative value found
			if(A[i]<0) {
				int l=0;
				int r=0;
				//checking left consecutive positive elements
				for(int j=i-1;j>=0;j--) {
					if(A[j]>=0) {
						l++;
					}else {
						break;
					}
				}
				//checking right consecutive positive elements
				for(int j=i+1;j<n;j++) {
					if(A[j]>=0) {
						r++;
					}else {
						break;
					}
				}
				//System.out.println(l+" "+r);
				
				//assigning the max size index
				if(l > maxSize) {
					arr[0] = i-l;
					arr[1] = i-1;
					maxSize = l;
				}
				if(r > maxSize) {
					arr[0] = i+1;
					arr[1] = i+r;
					maxSize = r;
				}
			}
		}
		
		System.out.println(" Arrays size = "+Arrays.toString(arr));
		System.out.println("MaxSize = "+maxSize);

		//edge case - if max size is zero return whole array
		if(maxSize == 0)
			return A;
		
		//assigning the array to the new array then returned
		int nn[] = new int[maxSize];
		//System.out.println(Arrays.toString(nn));
		int ind=0;
		for(int i=arr[0];i<arr[1]+1;i++) {
			nn[ind] = A[i];
			ind++;
		}
		
		return nn;
	}
}
