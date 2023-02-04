package t7_Strings;

public class LongestPalindromicSubString {
	public static void main(String[] args) {
		String s = "aabaccab";
		System.out.println(longestPalinString(s));

		System.out.println(longestPalindrome(s));
	}

//=================================================================================
	
	// Time complexity = O(n^3)
	// Space complexity = O(1)
	public static String longestPalinString(String str) {
		int max = 0;
		String ans = "";
		// consider the substrings
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (palindrome(str, i, j)) {
					// System.out.println(str.substring(i, j+1)+" - ");
					// assigns max substring
					if (max < j - i + 1) {
						ans = str.substring(i, j + 1);
					}
					// assigns max value
					max = Math.max(max, j - i + 1);
				}
			}
		}
		System.out.println(max);
		// check whether it is plaindrome or not

		return ans;
	}

	// Checks palindrome or not
	// Time complexity = O(n)
	// Space complexity = O(1)
	public static boolean palindrome(String s, int i, int j) {
		if (s.length() == 1) {
			return true;
		}
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;
	}
//==================================================================================
	
	//Time complexity = O(n^2)
	//Space complexity = O(1)
	public static String longestPalindrome(String A) {
		int n = A.length();
		String ans = "";
		int maxLen = 0;
		
		// Loop and check every letter max sideways
		for (int i = 0; i < (n-1); i++) {
			//even adding adding right = i+1;
			String temp1 = maxsubstring(A, i, i+1);
			//odd
			String temp2 = maxsubstring(A, i, i);
			String sun = "";
			if(temp1.length() > temp2.length()) {
				sun = temp1;
			}else {
				sun = temp2;
			}
			if(maxLen < sun.length()) {
				ans = sun;
				maxLen = sun.length();
				
			}
		}
		System.out.println(maxLen);
		return ans;
	}

	//TC = O(n)
	//SC = O(1)
	public static String maxsubstring(String A, int l, int r) {
		int n = A.length();

		// then check for every letter
		while (l >= 0 && r < n && A.charAt(l) == A.charAt(r)) {
			l--;
			r++;
		}
		
		l = l+1;
		
		String sub = A.substring(l,r);

		return sub;
	}

//	public static String longestPalindrome(String A) {
//		int start = 0;
//		int maxlen = 0;
//		int n = A.length();
//		for (int i = 0; i < n - maxlen / 2; i++) {
//			int j = i;
//			int k = i;
//			while (k < n - 1 && A.charAt(k) == A.charAt(k + 1))
//				k++;
//			while (j > 0 && k < n - 1 && A.charAt(j - 1) == A.charAt(k + 1)) {
//				j--;
//				k++;
//			}
//			int length = k - j + 1;
//			if (length > maxlen) {
//				start = j;
//				maxlen = length;
//			}
//		}
//		return A.substring(start, start + maxlen);
//	}

}
