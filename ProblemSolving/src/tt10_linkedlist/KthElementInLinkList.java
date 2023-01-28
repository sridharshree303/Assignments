package tt10_linkedlist;

public class KthElementInLinkList {
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		
		A.next = B;
		B.next = C;
		C.next = D;
		
		System.out.println(solve2(A,2));
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve2(ListNode A, int B) {
		ListNode temp = A;
		for(int i=0;i<B;i++) {
			temp = temp.next;
		}
		
		return temp.val;
	}

	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve(ListNode A, int B) {
		// base condition
		if(A.next == null) {
			return A.val;
		}
		// main logic
		int current = 0;
		ListNode temp = A;
		while(temp != null) {
			if(current == B)
				return A.val;
			
			A = A.next;
			current++;
		}
		return 0;
	}

}
