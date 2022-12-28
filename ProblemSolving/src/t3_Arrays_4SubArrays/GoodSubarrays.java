package t3_Arrays_4SubArrays;

public class GoodSubarrays {
	public static void main(String[] args) {
		int A[] = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		int B =65;
		System.out.println(solve(A,B));
	}
	
	//TC = O(n^2)
	//SC = O(1)
	public static int solve(int[]A,int B) {
		int n = A.length;
		int count = 0;
        for(int i=0;i<n;i++){
        	int sum =0;
            for(int j=i;j<n;j++){
            	int temp = j-i+1;
                sum += sum;
                if(temp%2==0 && sum < B) {
                	count++;
                }else if(temp%2==1 && sum > B){
                	count++;
                }
            }
        }
		return count;
	}
}
