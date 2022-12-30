package t3_Arrays_52Dmatrices;

import java.util.Arrays;

public class AntiDiagonals {
	public static void main(String[] args) {
		int aa[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int ss[][] = solve(aa);
		for(int i=0;i<ss.length;i++) {
			System.out.println(Arrays.toString(ss[i]));
		}
	}
	
	//TC = 0(M*N)
	//SC = O(1)
	public static int[][] solve(int[][] A){
		int n = A.length;
        int m = A[0].length;
        int row = (2*n)-1;
        int [][] ar = new int[row][n];
        
        //left part of diagonal
        for(int i=m-1;i>=0;i--){
            int x = 0;
            int y = i;
            int r = y;
            while(x < n && y >= 0){
                ar[r][x] = A[x][y];
                x++;
                y--;
            }
        }
        //right part
        for(int i=1;i<n;i++) {
        	int x = i;
        	int y = m-1;
        	int r = y+x; int c =0;
        	while(x<n && y>=0 ) {
        		ar[r][c] = A[x][y];
        		x++;
        		y--;
        		c++;
        	}
        }
        
		return ar;
	}
	
	
}
