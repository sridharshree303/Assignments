package t2_TimeComplexity;

/*How to calculate Big O from the number of iterations ?

  1. Ignore lower order terms
  2. Ignore constants
-----------------------------------------------------
 example : 4n^2 + 3n + 2 
 	1st step : Ignore lower order terms => 4n^2
 	2nd step : Ignore constants => n^2
 	
 	Big O of above equations is --> O(n^2)
 -----------------------------------------------------
 example : 3nsqrt(n) + 4logn + 3nlogn 
 	assume n = 2^32
 		nsqrt(n) => 2^32 * sqrt(2^32) => 2^32+16 => 2^48
 		nlogn    => 2^32 * log(2^32)  => 2^32 * 32 => 2^32+5 = 2^37
	
	Big O of above equation is --> O(n sqrt(n))
*/
public class loops {
	static int n = Integer.MAX_VALUE;
	public static void main(String[] args) {
		for(int i=1; i<n;i++) {
			//i : [1,n]
			//n-1+1 = n iterations
			//time complexity -> O(n)
		}
		
		for(int i=1; i<=100; i++) {
			//i : [0,100]
			//100-0+1 = 101 iterations
			//time complexity -> O(1)
			//because complexity is constant here i.e 100
		}
		
		for(int i=1; i<=n; i+=2) {
			// n -> 4 => n/2 => 2 iterations
			// n -> 5 => n/2 => 2 iterations -- this is wrong
			
			// (n+1)/2 
			// n -> 4 => (4+1)/2 => 2 iterations -- 1,3
			// n -> 5 => (5+1)/2 => 3 iterations -- 1,3,5
			
			//time complexity for (n+1)/2 -> O(n)
			// (n+1)/2 => (n/2) + (1/2) => n
		}
		
		for(int i=1; i*i<=n; i++) {
			//i : [1,sqrt(n)]
			//sqrt(n)-1+1 = sqrt(n) iterations
			//time complexity -> O(sqrt(n))
		}
		
		int a = n;
		while(a > 1) {
			/*
			 * assume a = 16
			 * 	  a = 16/2 = 8/2 = 4/2 = 2/2 -> 4 iterations
			 * 	  log n => log 16 => 2^4 => 4 
			 * 		
			 * 	 -> no of iterations -> log2(n)
			 *   -> Time complexity : O(log n)
			 */
			a = a/2;
		}
		
		for(int i=0; i <= n; i*=2) {
			// infinite -> increment is i*i
			// Time complexity -> O(infinite)
		}
		
		for(int i=1; i<=n; i=i*2) {
			// 1,2,4,8,16,32.....
			// No of iterations -> log n
			// time complexity -> O(log n)
		}
		
		//Nested loops
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=n; j++) {
				// i = constant => [1,10] - 10 iterations
				// j = n iterations => [1,n] -> 10n iterations
				// Time complexity => 10 + 10n -> O(n)
			}
		}
		
		// no of iterations => 10^5 + 100
		// time complexity --> O(1) -> fixed range or constant
		int x = 100;
		for(int i= 0; i < (10^5); i++) {
			while(x < 100) {
				//the j initializes outside the loop
				x++;
			}
		}
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <=n; j++) {
				// no of iterations -> n*n
				// Time complexity -> O(n2)
			}
		}
		
		for(int i=1; i<= n; i++) {
			for(int j=1; j<=n ; j = j*2) {
				//no of iterations -> n + n*log n
				// time complexity -> O(n log n)
			}
		}
		
		//HW
		for(int i=1; i<= n; i++) {
			for(int j=1; j <= (2^i); j++) {
				// no of iterations -> n + n*2^n
				// Time complexity -> O(n*2^n) or O(2^n)
			}
		}
		
		//Time complexity -> O(1)
		for(int i=0; i<n; i++) {
			if(i == 2)
				break;
		}
		
		//time complexity -> O(n)
		for(int i=1; i<=n ; i += 2) {
			//TODO
		}
		
		
	}
}



