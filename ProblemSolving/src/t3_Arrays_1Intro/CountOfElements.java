package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given n array elements, count number of elements having atLeast 1 element greater than itself
//Note :  Sorting is not allowed
//ex1 : array[7] = {-1,2,4, 5,6,4,6 }
//answer : 5
public class CountOfElements {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(-1,3,2,5,6,3,6);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(arr);
		System.out.println(countValues(list));
	}
	
	//find the maximum value in the array
	//Time complexity = O(n)
	public static int maxValue(ArrayList<Integer> arr) {
		int maxVal = arr.get(0); // Integer.MIN
		for(int i=0;i <arr.size();i++) {
			if(arr.get(i)>maxVal) {
				maxVal = arr.get(i);
			}
		}
		return maxVal;
	}
	
	//Find the frequency of Maximum
	//Time complexity = O(n)
	public static int frequency(ArrayList<Integer> arr) {
		int count = 0;
		int maxVal = maxValue(arr);
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) == maxVal) {
				count++;
			}
		}
		return count;
	}
	
	//Return result count
	//Time complexity => O(n)
	//Space Complexity => O(1)
	public static int countValues(ArrayList<Integer> arr) {
		int x = arr.size();
		int y = frequency(arr);
		return x-y;
	}
}



//public class MaxCountElements {
//	public static void main(String[] args) {
//		int arr[] = {-1,3,2,5,6,3,6};
//		System.out.println(countValues(arr));
//	}
//	
//	//find the maximum value in the array
//	//Time complexity = O(n)
//	public static int maxValue(int arr[]) {
//		int maxVal = arr[0]; // Integer.MIN
//		for(int i=0;i <arr.length;i++) {
//			if(arr[i]>maxVal) {
//				maxVal = arr[i];
//			}
//		}
//		return maxVal;
//	}
//	
//	//Find the frequency of Maximum
//	//Time complexity = O(n)
//	public static int frequency(int arr[]) {
//		int count = 0;
//		int maxVal = maxValue(arr);
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == maxVal) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	//Return result count
//	//Time complexity => O(n)
//	//Space Complexity => O(1)
//	public static int countValues(int arr[]) {
//		int x = arr.length;
//		int y = frequency(arr);
//		return x-y;
//	}
//}
