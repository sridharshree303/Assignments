package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array A of Size N. You need to find the sum of Maximum
//and Minimum element in the given array
public class MaxMinArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,1);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(list);
		
		System.out.println(solve(arr));
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve(ArrayList<Integer> A) {
		int min = A.get(0), max=A.get(0);
		for(int i=1;i<A.size();i++) {
			int a = A.get(i);
			if(a < min) {
				min = a;
			}
			if(a > max) {
				max = a;
			}
		}
		return max+min;
    }
}

