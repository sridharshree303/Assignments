package t7_Strings;

import java.util.Arrays;

public class CountAlphabets {
	public static void main(String[] args) {
		String A = "ajasfeujsandjskajfuiusiicsj";
		System.out.println(countSort(A));
	}
	
	public static String countSort(String A) {
		
		char ar[] = A.toCharArray();
		
		//intialise array with 26 size
		int arr[] = new int[26];
		int n = A.length();
		
		//find the frequency and store in array
		for(int i=0;i<n;i++) {
			int index = ar[i] - 'a';
			arr[index]++;
		}
		
		//sort by replacing elements into array
		int ind = 0;
		char c = 'a';
		for(int i=0;i<arr.length;i++) {
			int count = arr[i];
			for(int j=0;j<count;j++) {
				ar[ind] = (char) c;
				ind++;
			}
			c++;
		}
		
		return new String(ar);
	}
	
}
