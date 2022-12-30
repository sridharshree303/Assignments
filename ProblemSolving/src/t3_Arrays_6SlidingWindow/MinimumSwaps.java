package t3_Arrays_6SlidingWindow;

public class MinimumSwaps {
	public static void main(String[] args) {
		int [] aa = {2, 7, 9, 5, 8, 7, 4};
		int B = 5;
		System.out.println(solve(aa,B));
		
	}
	
	//TC = O(1)
	//SC = O(1)
	//TWO pointer approach = 3725 ms
	public static int solve(int[] A, int B) {
		int n = A.length;
		//find  the count of elements <= B in N range
		int size = 0;
		for(int i=0;i<n;i++) {
			if(A[i] <= B)
				size++;
		}
		
		//count the elements > B in the O to Size range
		int val = 0;
		for(int i=0;i<size;i++) {
			if(A[i]>B)
				val++;
		}
		
		int ans = val;
		//two pointer approach
		for(int i=0,j=size;j<n;i++,j++) {
			if(A[i]> B & A[j] <= B)
				val--;
			if(A[j]> B & A[i] <= B )
				val++;
			ans = Math.min(ans, val);	
		}
		
		return ans;
	}
	
	//TC = O(N)
	//SC = O(1)
	//Sliding window approach = 4044 ms
	public static int solve1(int[] A, int B) {
		//find the count of the A[i]<=B
		int n = A.length;
		int size = 0;
		
		for(int i=0;i<n;i++) {
			if(A[i]<=B)
				size++;
		}
		
		//find the elements > B in the K size
		int ans = 0;
		int ansSwaps = Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(A[i]>B)
				ans++;	
		}
		ansSwaps = Math.min(ansSwaps, ans);
		
		//loop the array
		//Sliding window approach
		int e = size;
		while(e<n) {
			System.out.println(e);
			if(A[e-size]<=B && A[e]>B) {
				ans++;
			}
			else if(A[e-size]>B && A[e]<=B) {
				ans--;
			}
			ansSwaps = Math.min(ansSwaps, ans);
			e++;
		}
		//2, 7, 9, 5, 8, 7, 4
		//ans = 2;
		//0 -> 
		
		return ansSwaps;
	}
}
