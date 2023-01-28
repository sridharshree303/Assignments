package tt10_linkedlist;

public class SearchLinkList {
	// node
	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// search Method
	//Time complexity = O(n)
	//Space complexity = O(1)
	public int solve(ListNode A, int B) {
		//base condtion
		if(A == null)
			return 0;
		//main logic
		ListNode temp = A;
		while(temp != null) {
			if(temp.val == B) {
				return 1;
			}
			temp = temp.next;
		}
		return 0;
	}
}
