package t7_Strings;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String s = "The Sky is Blue";
		
		System.out.println(solve(s));
	}
	
	//TC = O(n+k)
	//SC = O(n)
	public static String solve(String A) {
		//split into elements
		//TC = O(n+k)
		String[] s = A.split(" ");
		
		//reverse 
		//TC = O(n)
		//SC = O(1)
		int n = s.length;
		
		for(int i=0;i<n/2;i++) {
			//swap
			String temp = s[i];
			s[i] = s[n-1-i];
			s[n-1-i] = temp;
		}
		//join all the elements
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n-1;i++) {
			sb.append(s[i]+" ");
		}
		sb.append(s[n-1]);
		return sb.toString();
	}
}
