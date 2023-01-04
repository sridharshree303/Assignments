package t3_Arrays_InterviewPrblms2;

import java.util.Arrays;

public class SpecialIndex {
	public static void main(String[] args) {
		int[] nn = { 1, 1, 1 };
		System.out.println(solve(nn));
	}

	//TC = O(n)
	//SC = O(n)
	public static int solve(int[] A) {
		int n = A.length;
		// even prefix sum
		int[] even = new int[n];
		even[0] = A[0];
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0)
				even[i] = even[i - 1];
			else
				even[i] = even[i - 1] + A[i];
		}
		// odd prefix sum
		int[] odd = new int[n];
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0)
				odd[i] = odd[i - 1];
			else
				odd[i] = odd[i - 1] + A[i];
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		// loop all and find the special index
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int ev = 0;
			int od = 0;
			if (i == 0) {
				ev = odd[n - 1] - odd[i];
				od = even[n - 1] - even[i];
			} else {
				ev = even[i - 1] + odd[n - 1] - odd[i];
				od = odd[i - 1] + even[n - 1] - even[i];
			}

			if (ev == od) {
				ans++;
			}
		}
		return ans;
	}
}
