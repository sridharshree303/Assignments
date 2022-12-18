package t3_Arrays_52Dmatrices;

public class Diagnoal {
	public static void main(String [] args) {
		int arr[][] = {{1,2,4},{3,0,7},{8,5,9}};
		leftToRight(arr);
	}
	
	public static void leftToRight(int [][] arr) {
		int n = arr.length;
		//TC = O(n^2)
		//SC = O(1)
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == j) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
		//optimal approach
		//TC = O(n)
		//SC = O(1)
		int i=0;int j=0;
		while(i<n&&j<n) {
			System.out.println(arr[i][j]);
			i++;
			j++;
		}
		
	}
}




