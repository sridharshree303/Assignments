package tt10_linkedlist;

public class InsertLinkList {

	// node
	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(7);
		ListNode ans = solve(head,5,7);
		System.out.println(ans.val+" -- "+ans.next);
	}

	//TIME COMPLEXITY - O(n)
	//Space complexity - O(1)
	public static ListNode solve(ListNode A, int B, int C) {
		//Initialise the node
		ListNode newNode = new ListNode(B);
		
		//if position is zero
		if(C == 0) {
			newNode.next = A;
			A = newNode;
			return A;
		}
		
		if(C == 1) {
			newNode.next = A.next;
			A.next = newNode;
			return A;
		}
		
		// main logic
		ListNode temp = A;
		int current = 0;
		while (temp.next != null) {
			//checking C position for inserting
			if(C-1 == current) {
				newNode.next = temp.next;
				temp.next = newNode;
				return A;
			}
			//moving forward or increment
			temp = temp.next;
			current++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	
		return A;
	}
}
