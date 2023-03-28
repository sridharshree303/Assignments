package t1_IntroToPrblmSolving;

// If the number of factors less than 2, then it is a prime Number.
public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(solve(192));
	}
	
	public static int solve(int A) {
		int count = 0;
		//Count primes in range 
		for(int i=1; i <= A; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
	
		return count;
    }
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i=2;i <num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
