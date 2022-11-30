package introToPrblmSolving;

public class FindNextSmallestPalindrome {
	public static void main(String[] args) {
		int org = 9939999;
		int number = org+1;
        while(!verifyPalindrome(number)) {
			number = number+1;
		}

		
		System.out.println("Next smallest palindrome : "+number);
	}
	
	public static boolean verifyPalindrome(int num) {
		int n,k, rev = 0;
		
		n = num;
		
		//reverse the number
		while(num != 0) {
			k = num % 10;
			rev = (rev*10) + k;
			num = num / 10;
		}
		
		//check if num and its reverse is same or not
		if(n == rev) {
			return true;
		}else {
			return false;
		}
	}
}
