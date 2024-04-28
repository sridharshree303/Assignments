package t3_Arrays;

import java.util.HashMap;

public class SpicesSubarray {
	public static void main(String[] args) {
		//1,8,2,6,3,2,3,6
		int [] aa = {1,2,3,4,5,6,7};
		System.out.println(solve(aa));
	}
	
	public static int solve(int[] A) {
		//store frequency
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxFreq = 1;
		for(int i=0;i<A.length;i++) {
			if(map.containsKey(A[i])) {
				int val = map.get(A[i])+1;
				map.replace(A[i], val );
				if(maxFreq <= val) {
					maxFreq = val;
				}
			}else {
				map.put(A[i], 1);
			}
		}
		
		//get the subarray length
		int i = 0;
		int j = A.length-1;
		//left to right
		System.out.println(maxFreq);
		while (map.get(A[i]) != maxFreq) {
			i++;
		}
		
		//right to left
		while (map.get(A[j]) != maxFreq) {
			j--;
		}
		System.out.println(i+"--"+j);
		return j-i+1;
	}
}
