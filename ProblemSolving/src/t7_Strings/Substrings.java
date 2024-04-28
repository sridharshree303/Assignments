package t7_Strings;

import java.util.Arrays;

public class Substrings {
	public static void main(String[] args) {
		String a = "aa";
		System.out.println(solve(a));
	}
	
	public static long solve(String A) {
		int n = A.length();
		
		
		//Array
		int arr[] = new int[26];
		
		for(int i=0;i<n;i++) {
			int ch = (int) (A.charAt(i)- 'a');
			arr[ch]++;
		}
		
		Long ans = 0L;
		for(int i=0;i<26;i++) {
			int temp = arr[i];
			ans += (temp*(temp+1))/2;
		}
		
		return ans;
	}
}
