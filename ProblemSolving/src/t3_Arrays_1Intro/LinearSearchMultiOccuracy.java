package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an Array A and an Integer B, find the number of occurrences 
//of B in A
public class LinearSearchMultiOccuracy {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,1);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(list);
		System.out.println(solve(arr,2));
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve(ArrayList<Integer> A,int B) {
		int count =0;
		int N = A.size();
		for(int i=0;i<N;i++) {
			if(A.get(i) == B) {
				count++;
			}
		}
		return count;
	}
	
	//One more approach , sorting and 
}
