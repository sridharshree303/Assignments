package t4_BitManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraysWithBitwiseOR1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( 1, 0, 0, 1, 1, 1, 1, 1, 1);
		ArrayList<Integer> aa = new ArrayList<>();
		aa.addAll(list);
		System.out.println(solve(9,aa));
	}
	
	public static Long solve(int A, ArrayList<Integer> B) {
		int zeros= 0;
		//TC = o(N)
		for(int i=0;i<A;i++) {
			if(B.get(i)==0) {
				zeros++;
			}
		}
		int ones = cal(A);
		zeros = cal(zeros);
		System.out.println(ones+" -- "+zeros);
		Long count = (long) (ones-zeros);
		return count;
	}
	
	public static int cal(int a) {
		return (a*(a+1))/2;
	}

}
