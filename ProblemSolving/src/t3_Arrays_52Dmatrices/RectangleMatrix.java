package t3_Arrays_52Dmatrices;

public class RectangleMatrix {
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4,44},{5,6,7,8,88},{9,10,11,12,13}};
		solve(a);
	}
	
	public static void solve(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		
		//left part of diagonal
		for(int i = m-1;i>=0;i--) {
			int x = 0;
			int y = i;
			while(x < n && y >= 0) {
				System.out.print(A[x][y]+" ");
				//System.out.println(x+" - "+y);
				x++;
				y--;
			}
			System.out.println();
		}
		
		//right part of diagonal
		for(int i=1;i<n;i++) {
			int x=i;
			int y=m-1;
			while(x<n && y >=0) {
				System.out.print(A[x][y]+" ");
				x++;
				y--;
			}
			System.out.println();
		}
	}
}
