package t9_recursion;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		reverseStr(str, n-1);
		sc.close();
	}

	//TC = O(n)
	//SC = O(n)
	public static String reverseStr(String A,int n) {
		if(n < 0) {
			return "";
		}
		System.out.print(A.charAt(n));
		return reverseStr(A, n-1);
	}
}
