package t3_Arrays_2PrefixSum;

import java.util.Arrays;

public class RangeSumQuery {
	public static void main(String[] args) {
		int A[] = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5 };
		int B[][] = {{7,10},{3,10},{3,5},{1,10}};
		long[] aa = prefixSum(A,B);
		System.out.println(Arrays.toString(aa));
	}
	
	//TimeComplexity = O(n+q)
	//Space Complexity = O(n) -> creating new array inside
	public static long[] prefixSum(int A[],int B[][]) {
		//prefix sum
        long AA[] = new long[A.length];
        AA[0] = A[0];
        for(int i=1;i<A.length;i++){
            AA[i] = AA[i-1]+A[i];
        }
        System.out.println(Arrays.toString(AA));
        //Intial array
        int n = B.length;
        long[] res = new long[n];
        //Loop queires
        for(int i=0;i<n;i++){
            int x = B[i][0]-1;
            int y = B[i][1]-1;
            if(x == 0)
                res[i] = AA[y];
            else
                res[i] = AA[y]-AA[x-1];
        }
        return res;
		
	}
	
	// can we think in terms of n>q and q>n
	// TC : O(n+q)
}
