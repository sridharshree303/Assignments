package t3_Arrays_4SubArrays;

public class MaxSubArray {
	public static void main(String[] args) {
		int A = 61;
		int B = 8;
		int C[] = {34, 75, 69, 43, 8, 34, 54, 79, 7, 39, 64, 85, 37, 14, 50, 40, 78, 5, 98, 13, 89, 45, 30, 66, 50, 90, 28, 13, 64, 44, 78, 58, 94, 100, 65, 88, 69, 48, 41, 64, 56, 60, 100, 95, 96, 66, 11, 92, 32, 17, 65, 39, 42, 90, 37, 20, 21, 24, 93, 47, 26};
		
		System.out.println(solve(A,B,C));
	}

	public static int solve(int A, int B, int[] C) {
		 //edge case
        int maxSum = 0;
        int n = C.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += C[j];
                if(sum <= B){
                    count++;
                    if(sum > maxSum)
                        maxSum = sum;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        return maxSum;
	}
}
