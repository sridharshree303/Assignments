package tt10_linkedlist;

public class CompareLinkList {
	public static void main(String[] args) {

	}

	// Iterative approach
	// TC = O(N)
	// SC = O(1)
	public static int solve(ListNode A, ListNode B) {
		while (A != null || B != null) {
			if (A.val != B.val) {
				return 0;
			}
		}
		return 1;
	}

	// recursive approach
	// TC = O(n)
	// SC = O(n)
	public static int solve2(ListNode A, ListNode B) {
		if (A.val != B.val) {
			return 0;
		}
		if (A.next == null && B.next == null) {
			return 1;
		}
		return solve(A.next, B.next);

	}
}
