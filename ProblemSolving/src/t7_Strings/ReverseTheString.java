package t7_Strings;

import java.util.Arrays;

public class ReverseTheString {
	
	public static void main(String[] args) {
		String str = new String("SridhaR");
		System.out.println(reverseString(str));
	}
	
	//TC = O(n);
	//SC = O(n);
	public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        return sb.toString();
        
    }
	
	//Time complexity = O(n)
	//Space complexity = O(n)
	public static String reverseString(String A) {
		//Initialise char array with string length
		char[] ch = A.toCharArray();
		int n = A.length();
		
		//loop and swap
		for(int i=0;i<=n/2;i++) {
			char temp = ch[i];
			ch[i] = ch[n-1-i];
			ch[n-1-i] = temp;
		}
		
		return new String(ch);
	}
}
