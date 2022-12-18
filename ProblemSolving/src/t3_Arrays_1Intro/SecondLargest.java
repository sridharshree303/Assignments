package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given an Integer array A. You have to find the second
//largest element or value in the array or report that no such 
//element exists.
public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,2);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.addAll(list);
		
		System.out.println(solve(ar));
		System.out.println(solve2(ar));
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	//Using two loops
	public static int solve(ArrayList<Integer> A) {
		int max = A.get(0);
		int secMax = 0;
		if(A.size()==1) {
			return -1;
		}else {
			for(int i=0;i<A.size();i++) {
				if(max < A.get(i))
					 max = A.get(i);
			}
			
			for(int i=0;i<A.size();i++) {
				int a = A.get(i);
				if(secMax < a && a != max) {
					secMax = a;
				}
			}
		}
		return secMax;
	}
	
	//Time complexity = O(n)
	//Space complexity = O(n)
	//Using Single loop 
	public static int solve2(ArrayList<Integer> A) {
		int max = A.get(0);
		int secMax = 0;
		if(A.size()==1) {
			return -1;
		}
		for(int i=0;i<A.size();i++) {
			int a = A.get(i);
			if(a > max) {
				secMax = max;
				max = a;
			}else if(a > secMax && a < max) {
				secMax = a;
			}
		}
		return secMax;
	}
}





