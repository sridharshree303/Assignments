package t3_Arrays_52Dmatrices;

import java.util.Arrays;

public class Transposesq {
	public static void main(String[] args) {
		int[][] aa = {{1,2,3},{4,5,6},{7,8,9}};
		solve(aa);
	}
	
	public static void solve(int[][] A) {
		int r = A.length;
        int c =A[0].length;
        //creating new array SC = O(1)
        int[][] aa = new int[c][r];

        //TC = O(n^2)
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                aa[j][i] = A[i][j];
            }
        }
        
        for(int i=0;i<r;i++) {
        	System.out.println(Arrays.toString(aa[i]));
        }
        
        // by swapping for square matrix 
        //SC = O(1)
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            	int temp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
        for(int i=0;i<r;i++) {
        	System.out.println(Arrays.toString(aa[i]));
        }
	}
}
