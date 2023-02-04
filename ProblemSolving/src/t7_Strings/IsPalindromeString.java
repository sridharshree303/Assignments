package t7_Strings;

public class IsPalindromeString {
	public static void main(String[] args) {
		String str = "malayalam";
		System.out.println(isPalindrome(str));
		
	}
	
	//TC = O(n)
	//SC = O(1)
	public static boolean isPalindrome(String str) {
		
		int n = str.length();
		//base condition
		if(n == 0 || n == 1) {
			return true;
		}
		//main logic
		int l = 0;
		int r = n-1;
		
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
