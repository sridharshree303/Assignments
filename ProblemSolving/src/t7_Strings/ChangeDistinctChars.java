package t7_Strings;

import java.util.Arrays;

public class ChangeDistinctChars {
	public static void main(String[] args) {
		String str = "abcbbccdd";
		System.out.println(solve(str,2));
	}

	public static int solve(String A, int B) {
		//intialize the char array with 26
		int [] arr = new int[26];
		
		//find the max char
		
		//count the frequency
		int n = A.length();
		for(char c : A.toCharArray()) {
			int i = c - 'a';
			arr[i]++;
		}
		
		//sort the array
		Arrays.sort(arr);
		
		int count = 0;
		//find the count 
		for(int val : arr) {
			if(val>0) {
				B = B-val;
				if(B < 0) {
					count++;
				}
			}
		}
		
		return count;
	}
}
