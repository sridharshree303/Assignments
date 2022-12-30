package t3_Arrays_6SlidingWindow;

public class SpiralMatrix {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int aa[][] = generateMatrix(5);
		for(int i=0;i<aa.length;i++) {
			int m = aa[i].length;
			for(int j=0;j<m;j++)
				System.out.print(aa[i][j]+" ");	
			System.out.println();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Start Time = "+startTime+" ms");
		System.out.println("End Time = "+endTime+" ms");
		int runtime = (int) (endTime-startTime);
		System.out.println(runtime+" ms");
	}
	
	public static int[][] generateMatrix(int A) {

		int N = A;
        int n = 1;
        int[][] ans = new int[N][N];
        int i=0, j=0;
        //using four for loops
        while(N>1){
       
            // 1st loop
            // i=0, j=0
            for(int k=1;k<N;k++){
                ans[i][j] = n++;
                j++;
            }

            // 2nd loop 
            // i=0, j=N-1;
            for(int k=1;k<N;k++){
                ans[i][j] = n++;
                i++;
            }

            // 3rd loop 
            // i=N-1, j=N-1;
            for(int k=1;k<N;k++){
                ans[i][j] = n++;
                j--;
            }

            // 4th loop 
            // i=N-1, j=0;
            for(int k=1;k<N;k++){
                ans[i][j] = n++;
                i--;
            }

            //Increment
            i++;
            j++;
            N = N-2;
            System.out.println(i+"--"+j+"--"+N);
            //edge case
            if(N==1){
                ans[i][j] = n;
                break;
            }
        }
        return ans;
	}
}
