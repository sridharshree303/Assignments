package t4_BitManipulations;

import java.util.ArrayList;

public class IntrestingArray {
	public static void main(String[] args) {
		
	}

	public String solve(ArrayList<Integer> A) {
		int n = A.size();
		int ans = A.get(0);
		//XOR the all array elements
		for (int i = 1; i < n; i++) {
			ans ^= A.get(i);
		}
		if((ans&1) == 0) {
			return "Yes";
		}
		return "No";
		
//		int ans = 0;
//		for(int x:A)
//			ans ^= x;
//		return (ans%2 == 0)? "Yes" : "No";
		
		
		
	}
}
