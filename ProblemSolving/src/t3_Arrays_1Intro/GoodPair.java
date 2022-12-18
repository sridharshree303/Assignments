package t3_Arrays_1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given n array elements, print true if there exists a pair of index i & j,
//where arr[i] + arr[j] = K

//Note :
//1. Array is not sorted
//2. i != j
//3. return true/false
//4. K is given as Input
public class GoodPair {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3,5,-1,6,4);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(arr);
		System.out.println(solve(list,18));
	}
	
	//Time complexity => O(n^2)
	//Space complexity => O(1)
	public static int solve(ArrayList<Integer> A, int B) {
		for(int i=0; i<A.size();i++) {
			//for(int j=0;j<A.size();j++) {
			for(int j=i+1;j<A.size();j++) {
				if(i!=j && (A.get(i)+A.get(j)== B)) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	//through sorting => O(n log n)
	//through Hashmap => O(n)
}
