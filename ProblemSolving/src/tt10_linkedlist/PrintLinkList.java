package tt10_linkedlist;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class PrintLinkList {
	public static void main(String[] args) {
		// TODO
	}

	//Time complexity - O(n)
	//Space complexity - O(1)
	public void solve(ListNode A) {
		// edge case if null
		if (A == null)
			return;
		// print the values
		while (A != null) {
			System.out.print(A.val + " ");
			A = A.next;
		}
		System.out.println();
	}
}
