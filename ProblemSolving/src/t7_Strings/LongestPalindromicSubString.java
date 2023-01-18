package t7_Strings;

public class LongestPalindromicSubString {
	public static void main(String[] args) {
		String s = "abbabcba";
		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String A) {
		int start = 0;
		int maxlen = 0;
		int n = A.length();
		for (int i = 0; i < n - maxlen / 2; i++) {
			int j = i;
			int k = i;
			while (k < n - 1 && A.charAt(k) == A.charAt(k + 1))
				k++;
			while (j > 0 && k < n - 1 && A.charAt(j - 1) == A.charAt(k + 1)) {
				j--;
				k++;
			}
			int length = k - j + 1;
			if (length > maxlen) {
				start = j;
				maxlen = length;
			}
		}
		return A.substring(start, start + maxlen);
	}
    
}
