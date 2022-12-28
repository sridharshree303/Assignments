package t4_BitManipulations;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,1,1,1,2,2);
		System.out.println(solve(list));
	}
	public static int solve(final List<Integer> A) {
	    int ans = 0;
		for(int i=0;i<A.size();i++) {
	    	ans ^= A.get(i);
	    }
		return ans;
    }
}
