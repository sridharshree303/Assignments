package t3_Arrays_2PrefixSum;

import java.util.Arrays;

public class EvensInRange {
	public static void main(String[] args) {
		int A[] = {2, 1, 8, 3, 9};
		int B[][] = {{0,3},{2,4}};
		int[] aa = solve(A,B);
		System.out.println(Arrays.toString(aa));
	}
	public static int[] solve(int[] A, int[][] B) {
        //carry forward TC = O(n) SC = O(1)
        int n = A.length;
        int nb= B.length;
        int c = 0;
        A[0] = A[0]%2 == 0 ? ++c : 0;
        for(int i=1;i<n;i++){
            if(A[i]%2==0){
                ++c;
            }
            A[i] = c;
        }
        //initial array TC = O(q) SC = O(q)
		int[] res = new int[nb];
		
        //loop queries TC = O(q) SC = O(1)
		for(int i=0;i<nb;i++) {
			int a = B[i][0];
			int b = B[i][1];
			if(a == 0) {
				res[i] = A[b];
			}else {
				res[i] = A[b]-A[a-1];
			}
		}
        return res;
    }
}
