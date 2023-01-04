package t3_Arrays_InterviewPrblms1;

import java.util.Arrays;

public class MulLeftRotations {
	public static void main(String[] args) {
		int A[] = {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
		int B[] = {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
	
		int ans[][] = solve1(A,B);
		for(int i=0;i<B.length;i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
	}
	
	//Run time = 31000 ms
	public static int[][] solve1(int[] A, int[] B){
		int n = A.length;
		int m = B.length;
		int[][] aa = new int[m][n];
		
		for(int i=0;i<m;i++) {
			int k = B[i];
			for(int j=0;j<n;j++) {
				aa[i][j] = A[(j+k)%n];
			}
		}
		return aa;
	}
	
	//TC = O(M*N)
	//SC = O(M*N)
	//Runtime = 32300 ms
	public static int[][] solve(int[] A, int[] B){
		//Initialize new array with m*n size
		int n = A.length;
		int m = B.length;
		int[][] aa = new int[m][n];
		
		//loop and reverse the values
		for(int i=0;i<m;i++) {
			int k = B[i]%n;
			int ind = 0;
			aa[i] = A.clone();
			for(int j=k;j<n;j++) {
				aa[i][ind] = A[j];
				ind++;
			}
			
			for(int j=0;j<k;j++) {
				aa[i][ind] = A[j];
				ind++;
			}
		}
		
		return aa;
	}
}
