package t3_Arrays_3CarryForward;

import java.util.Arrays;

//Leaders in a array
//Given an array, you have to find all leaders in arr[]
//All element is a leader, if it is greater than all elements on its right side
//Note : arr[n-1] is always on its right side

// arr[] = {15,-1,7,5,4,2,3}
// ans = 5;
public class LeadersInArray {
	public static void main(String[] args) {
		int arr[] = { 93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};
//		System.out.println(maxLeader(arr));
		int A[] = solve(arr);
		System.out.println(Arrays.toString(A));
	}

	public static int[] solve(int[] A) {
			//count the max values
			int n = A.length-1;
			int count = 1;
			int max = A[n];
			for(int i=n-1;i>=0;i--) {
				if(A[i]>max) {
					count++;
					max = A[i];
				}
			}
			System.out.println(count);
			//push values
			int[] aa = new int[count];
			int c = 0;
			aa[c] = A[n];
			int maxele = A[n];
			for (int i = n-1 ; i >= 0; i--) {
				if (A[i] > maxele) {
					aa[++c] = A[i];
					maxele = A[i];
				}
			}
			return aa;
	}


	// approach is move from right to left
	// because (n-1) is always a leader
	// Time complexity = O(n)
	// Space complexity = O(1)
	public static int maxLeader(int arr[]) {
		int n = arr.length - 1;
		int curMax = arr[n];
		int count = 1;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > curMax) {
				count++;
				curMax = arr[i];
			}
		}
		return count;
	}
}
