package t3_Arrays_6SlidingWindow;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] aa = {4,3,2,6,8,9};
		int b = 2;
		int c = 6;
		System.out.println(35416%7); //3
		System.out.println(maxSub1(aa, b, c));
	}
	
	//prefix sum
	//TC = O(1)
	public static int maxSub1(int[] A,int B, int C) {
		int n=A.length;
		int []aa = new int[n];
		aa[0] = A[0];
		//prefix sum
		for(int i=1;i<n;i++) {
			aa[i] = aa[i-1]+A[i];
		}
		//finding max
		int max = 0;
		int i=1; int j= B-1;
		int sum = aa[j];
		j++;
		while(j<n) {
			sum = aa[j]-aa[i-1];
			if(sum > max) {
				max = sum;
			}
			i++;j++;
		}
		return max;
	}
	
	//TC = O(n)
	public static int maxSub(int[] A,int B, int C) {
		int N = A.length;
		int i=0;
		int j=B-1;
		int max = 0;
		while(j<N) {
			int sum =0;
			for(int x=i;x<=j;x++) {
				sum += A[x];
			}
			if(sum > max) {
				max = sum;
			}
			i++; j++;
		}
		return max;
	}
}
