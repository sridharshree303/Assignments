package introToPrblmSolving;

// If the number of factors one, then it is a prime Number.
public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(solve(19));
	}
	
	public static int solve(int A) {
		int count = 0;
		for(int i=1; i <= A; i++) {
			if(isPrime(i)) {
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
