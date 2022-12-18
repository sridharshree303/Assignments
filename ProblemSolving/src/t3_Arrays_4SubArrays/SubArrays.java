package t3_Arrays_4SubArrays;

import java.util.Arrays;

//Print all sub arrays
public class SubArrays {
	public static void main(String[] args) {
		int arr[] = {1,3,2,7};
		//printSubarrays(arr);
		//printSubarraySum(arr);
		System.out.println(maxSubbarray(arr));
	}
	
	//Print all sub arrays
	//Time complexity = O(n^2)
	//Space complexity = O(1)
	public static void printSubarrays(int[] arr) {
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			String str = "";
			for(int j=i;j<n;j++) {
				str += arr[j]+" ";
				System.out.println(str);
				++count;
			}
		}
		
		System.out.println(count); // 4+3+2+1
	}
	//If we have to return an list => SC will be O(N)
	
	//print sum of sub arrays
	public static void printSubarraySum(int[] arr) {
		int n = arr.length;
		int count = 0;
		
		//by using carry forward
		//TC = O(n^2)
		//SC = O(1)
		for(int i=0;i<n;i++) {
			int sum = 0;
			String str = "";
			for(int j=i;j<n;j++) {
				str += arr[j]+" ";
				System.out.print(str+" - ");
				sum += arr[j];
				System.out.println(sum);
				count++;		
			}
		}
		System.out.println(count); // 4+3+2+1
		
		//creating prefix array
		int pf[] = new int[n];
		pf[0] = arr[0];
		for(int i=1;i<n;i++) {
			pf[i] = pf[i-1]+arr[i];
		}
		//sum by using prefix sum
		//TC = O(n2)
		//SC = O(n) or O(1)
		for(int i=0;i<n;i++) {
			int total = 0;
			for(int j=i;j<n;j++) {
				if(i == 0) {
					total = pf[j]; 
				}else {
					total = pf[j]-pf[i-1];
				}
				System.out.println(total);
			}
		}
	}
	
	//print the max sub array by sum
	//TC = O(n^2)
	//SC = O(1)
	public static int maxSubbarray(int []arr) {
		int max = Integer.MIN_VALUE;
		int n = arr.length;
		int totalSubArr = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
				//sum of all sub arrays
				totalSubArr += sum;
			}
			
			//checking max sum after a loop
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println(totalSubArr); // 62
		return max;
	}
	//This can be optimized to O(n) by Kadane's algorithm
}






//print all subarrays sum 
//1  - 1
//1 3  - 4
//1 3 4  - 8
//1 3 4 5  - 13
//3  - 3
//3 4  - 7
//3 4 5  - 12
//4  - 4
//4 5  - 9
//5  - 5
//10





