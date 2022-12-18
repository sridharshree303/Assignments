package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an integer array A of size N. In one second, you can increase the value of one element by 1. 
//Find the minimum in seconds to make all elements of the array equal
//1 <= N <= 1000000
//1 <= A[i] <= 1000
public class TimeToEquality {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,1,3,2);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(list);
		System.out.println(solve(arr));
		System.out.println(solve2(arr));
	}
	
	//Find max in the array
	//Calculate the time taken for making all elements equal.
	//Time complexity = O(n)
	//Space Complexity = O(1)
	public static int solve(ArrayList<Integer> A) {
		int time = 0;
		int max = A.get(0);
		if(A.size()== 1) {
			return time;
		}else {
			for(int i=0;i<A.size();i++) {
				int a = A.get(i);
				if(a > max) {
					max = a;
				}
			}
			
			for(int i=0;i<A.size();i++) {
				int a = A.get(i);
				if(a != max) {
					time = time + (max-a);
				}
			}
		}
		return time;
    }
	
	//Time is calculated by (n*max)-sum
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve2(ArrayList<Integer> A) {
		int time = 0;
		long sum = 0;
		int max = A.get(0);
		int n = A.size();
		if(A.size()== 1) {
			return time;
		}else {
			for(int i=0;i<A.size();i++) {
				int a = A.get(i);
				sum = sum + a;
				if(a > max) {
					max = a;
				}
			}
		}
		
		time = (int) ((n*max)-sum);
		
		return time;
    }
}


