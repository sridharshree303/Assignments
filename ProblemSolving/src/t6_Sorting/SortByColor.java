package t6_Sorting;

import java.util.Arrays;

public class SortByColor {
	public static void main(String[] args) {
		int ans[] = {0,1,2,0,1,1,2};
		int[] aa = sortColors(ans);
		
		System.out.println(Arrays.toString(aa));
	}
	//DUTCH national flag algorithm
	//TC = 0(N)
	//SC = O(1)
	public static int[] sortColors(int [] A){
		int low = 0;
		int mid = 0;
		int high = A.length-1;
		
		while(mid <= high) {
			switch(A[mid]) {
				case 0 :
					int temp = A[low];
					A[low] = A[mid];
					A[mid] = temp;
					mid++;
					low++;
					break;
				case 1 :
					mid++;
					break;
				case 2 :
					int tt = A[mid];
					A[mid] = A[high];
					A[high] = tt;
					high--;
					break;
			}
		}
		return A;
	}
}
