package tt10_linkedlist;


public class DeleteLinklist {
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		
		A.next = B;
		B.next = C;
		C.next = D;
		
		ListNode Ans = solve(A,1);
		System.out.println(Ans.val+" -- "+Ans.next.val);
		
		PrintLinkList pp = new PrintLinkList();
		pp.solve(Ans);
	}

	//TC = O(n)
	//SC = O(1)
	public static ListNode solve(ListNode A, int B) {
		//base condition
		if(B == 0) {
			A = A.next;
			return A;
		}
		//main logic
		//Save prev and current position
		ListNode temp = A;
		ListNode prev = null;
		int current = 0;
		//Loop and check the node position
		while(temp != null) {
			//if position equals make prev.next as temp.next adress
			if(current == B) {
				prev.next = temp.next;
				return A;
			}
			prev = temp;
			temp = temp.next;
			current++;
		}
		//return head A
		return A;
	}
}
