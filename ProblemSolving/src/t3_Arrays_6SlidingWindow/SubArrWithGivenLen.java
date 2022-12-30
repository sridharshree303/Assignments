package t3_Arrays_6SlidingWindow;

public class SubArrWithGivenLen {
	public static void main(String[] args) {
		int[] aa = {6};
		int b = 1;
		int c = 6;
//		System.out.println(solve(aa,b,c));
		System.out.println(carryForwd(aa, b, c));
	}
	
	//sliding window approach - 1.2sec
	//carry forward  
	//TC = O(N)
	//SC = O(1)
	public static int carryForwd(int[] A,int B, int C) {
		int N = A.length;
		int summ = 0;
		//calculate the first B length sub array from 0 to B-1;
		for(int i=0;i<B;i++) {
			summ += A[i];
		}
		
		//use sliding window concept
		// sum = sum - start(i-1)+ end(B)
		// use for / while / do while loop
		int i=0;
		int j=B-1;
		do {
			if(i==0 && summ == C) {
				return 1;
			}else if(i>0){
				summ = summ - A[i-1] + A[j];
				if(summ == C) {
					return 1;
				}
			}
			i++;j++;
		}
		while(j<N);
		return 0;
	}
	
	// running time - 3.8 sec
	//TC = O(N*N-K+1)
	//SC = O(1)
	public static int solve(int[] A,int B, int C) {
		//total no of sub arrays with B length 
		//		 N-(B-1) => N-B+1;
		int N = A.length;
		int i=0;
		int j=B-1;
		while(j<N) {
			int sum =0;
			for(int x=i;x<=j;x++) {
				sum += A[x];
			}
			if(sum == C) {
				return 1;
			}
			i++; j++;
		}
		return 0;
	}
	//If K = K => (K)(N-K+1) 
	//If K = 1 => (1)(N-1+1) => O(N)
	//If K = N => (N)(N-N+1) => O(N)
	//If K = N/2 => (N/2)(N-(N/2)+1) => O(N^2)
}
