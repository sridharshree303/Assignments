package t7_Strings;

import java.util.Arrays;

public class ToLower {
	public static void main(String[] args) {
		char[] cc = { 'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y' };
		
		char[] low = to_lower(cc);
		System.out.println(Arrays.toString(low));

		char[] ans = to_upper(cc);
		System.out.println(Arrays.toString(ans));
	}

	// TC = O(n)
	// SC = O(1)
	public static char[] to_lower(char[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 'A' && A[i] <= 'Z') {
				A[i] = (char) (A[i] ^ (1 << 5));
			}
		}
		return A;
	}

	//TC = O(n)
	//SC = O(1)
	public static char[] to_upper(char[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 'a' && A[i] <= 'z')
				A[i] = (char) (A[i] ^ (1 << 5));
		}
		return A;
	}
}
