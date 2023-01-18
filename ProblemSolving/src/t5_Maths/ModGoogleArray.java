package t5_Maths;

public class ModGoogleArray {
	//TC = O(N)
	//SC = O(1)
	public static void main(String[] args) {

		int[] A = { 4, 5, 8, 9, 0, 8, 8, 2, 2, 5, 8, 4, 1, 5, 8, 9, 1, 1, 2, 4, 4, 0, 5, 5, 7, 8, 3, 5, 8, 9, 3, 7, 8,
				6, 8, 7, 8, 6, 8, 0, 7, 5, 3, 9, 6, 0, 3, 9, 4, 8, 8, 4, 7, 6, 6, 1, 3, 4, 6, 8, 8, 0, 6, 3, 8, 5, 1, 5,
				4, 8, 8, 2, 2, 1, 9, 5, 3, 5, 5, 1, 8, 1, 7, 7, 8, 0, 8, 1, 9, 2, 9, 7, 0, 8, 1, 7, 7, 5, 7, 8, 9, 3, 9,
				4, 7, 1, 5, 4, 8, 1, 4, 6, 1, 9, 9, 0, 8, 3, 0, 3, 9, 7, 6, 6, 4, 7, 6, 2, 2, 4, 4, 7, 0, 1, 2, 8, 9, 8,
				4, 9, 7, 8, 8, 4, 0, 7, 3, 1, 2, 5, 8, 4, 4, 2, 3, 7, 1, 1, 8, 1, 7, 6, 7, 4, 9, 2, 0, 5, 8, 3, 0, 0, 9,
				8, 1, 3, 0, 3, 3, 0, 4, 2, 7, 3, 7, 1, 1, 2, 7, 1, 6, 5, 3, 8, 6, 6, 2, 9, 5, 0, 2, 8, 3, 2, 5, 9, 4, 4,
				5, 5, 1, 4, 4, 2, 3, 0, 2, 0, 1, 6, 2, 5, 4, 1, 3, 3, 2, 6, 7, 5, 7, 4, 9, 1, 2, 4, 9, 9, 8, 5, 9, 7, 6,
				2, 9, 3, 6, 3, 2, 0, 7, 2, 0, 8, 5, 0, 9, 3, 7, 2, 1, 0, 1, 9, 1, 5, 6, 6, 9, 8, 5, 5, 3, 2, 1, 4, 0 };
		
		int n = A.length - 1;
		int B = 52;

		long exp = 1;
		int ans = 0;

		for (int i = n; i >= 0; i--) {
			ans = (int) ((ans % B) + ((A[i] * exp )% B) % B);
			exp = (exp * 10) % B;
		}
		System.out.println(ans % B);
	}
}
