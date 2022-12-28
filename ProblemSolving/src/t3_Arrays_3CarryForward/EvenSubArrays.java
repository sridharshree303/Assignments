package t3_Arrays_3CarryForward;

public class EvenSubArrays {
	public static void main(String[] args) {
		int A[] = { 654, 50, 694, 750, 712, 275, 736, 146, 279, 816, 707, 396, 406, 589, 370, 742, 840, 290, 505, 23, 249, 447, 618, 80, 968, 189, 600, 662, 91, 604, 575, 689, 72, 196,
				475, 198, 850, 844, 361, 419, 617, 911, 268, 628, 408, 404, 477, 921, 478, 806, 204,
				637, 403, 911, 589, 529, 867, 584, 768, 257, 437, 380, 698, 452, 368, 97, 977, 582, 
				775, 103 };
		System.out.println(solve(A));

	}
	
	//TC = O(1)
	//SC = O(1)
	public static String solve(int[] A) {
		int n = A.length;
		if(n%2 ==0 && A[0]%2==0 && A[n-1]%2 == 0) {
			return "YES";
		}
		return "NO";
	}
}
