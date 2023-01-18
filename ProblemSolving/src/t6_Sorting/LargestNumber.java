package t6_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0));
		System.out.println(largestNumber(list));
	}

	public static String largestNumber(final List<Integer> A) {

		Collections.sort(A,new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				String A = a+""+b;
				String B = b+""+a;
				long m = Long.parseLong(A);
				long n = Long.parseLong(B);
				
				if(m > n)
					return -1;
				else if(m < n)
					return 1;
				else 
					return 0;
			}
			
		});	
		System.out.println(A);  // [9, 5, 3, 34, 30]
		long sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<A.size();i++) {
			sb.append(A.get(i));
			sum += A.get(i);
		}
		if( sum == 0 ) return "0";
		else return sb.toString();
	}

}
