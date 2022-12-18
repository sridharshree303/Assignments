package t3_Arrays_4SubArrays;

import java.util.Arrays;

//In how many different sub arrays arr[i] exists 
//arr[] = [1,2,4,6,1,5] // 4 exits in n of sub arrays
//starting points => 0,1,2 = 3
//ending points => 2,3,4,5 = 4
//Total => 3*4 => 12 sub arrays having '4'
public class ElementExistInSubArr {
	public static void main(String[] args) {
		//starting points => [0,i] => i+1
		//Ending points => [i,n-1] => n-1-i+1 => n-i
		//Total => (i+1)*(n-i)
		int ar[] = {1,2,4,6,1,5}; //186
		System.out.println(totalSum(ar));
		System.out.println(noOfOccur(ar, 4));
	}
	
	public static int noOfOccur(int []arr,int B) {
		Integer index = null ;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == B) {
				index = i;
			}
		}
		if(index != null) {
			int count = (index+1)*(n-index);
			return count;
		}
		return -1;
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int totalSum(int []arr) {
		int totalSum = 0;
		int n= arr.length;
		for(int i=0;i<n;i++) {
			int contri = (i+1)*(n-i);
			totalSum += contri*arr[i];
		}
		return totalSum;
	}
}
