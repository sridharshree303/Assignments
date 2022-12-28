package t3_Arrays_1Intro;

import java.util.Arrays;

public class RangeSumQuery2 {
	public static void main(String[] args) {
		int A[] = {1,2,3,4,5};
		int B[][] = {{1,4},{2,3}};
		int[] aa = solve(A,B);
		System.out.println(Arrays.toString(aa));
	}
	
	 public static int[] solve(int[] A, int[][] B) {
	   //prefix sum
	   for(int i=1;i<A.length;i++) {
			A[i] = A[i-1]+A[i];
	   }
	   //Initial array
	   int[] arr = new int[B.length];
	   //Loop the query
	   for(int i=0;i<B.length;i++) {
		   int a = B[i][0]-1;
		   int b = B[i][1]-1;
		   if(a == 0) {
			   arr[i] = A[b];
		   }else {
			   arr[i] = A[b]-A[a-1];
		   }
	   }
	   return arr;
	 }
}
