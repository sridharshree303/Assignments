package t3_Arrays_2PrefixSum;

import java.util.Arrays;

public class ProductPuzzle {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int [] b = solve(A);
		System.out.println(Arrays.toString(b));
	}

	public static int[] solve(int[] A) {
		int psum = 1;
		//product;
		for(int i=0;i<A.length;i++) { //O(n)
			psum *= A[i];
		}
		//initialize array
		for(int i=0;i<A.length;i++) {
			A[i] = psum/A[i];
		}
		return A;
	}
}
