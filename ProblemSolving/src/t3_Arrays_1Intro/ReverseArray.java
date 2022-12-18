package t3_Arrays_1Intro;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n= arr.length-1;
		for (int x = 0; x < n / 2; x++) {
			int temp = arr[x];
			arr[x]= arr[n-x];
			arr[n-x]= temp;

		}
		System.out.println(Arrays.toString(arr)); //[5, 4, 3, 2, 1]
	}
	
	public static int[] revArray(int arr[]) {
		int i=0, n = arr.length-1;
		while (i < n/2) {
			//swapping
			int temp = arr[i];
			arr[i] = arr[n-i];
			arr[n-i] = temp;
		}
		return arr;
	}
}
