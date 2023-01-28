package tt10_linkedlist;

public class CheckSortedLinkList {
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(4);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(3);
		
		A.next = B;
		B.next = C;
		C.next = D;
		
		System.out.println(solve(A));
		System.out.println(recursive(A));
	}
	
	//using recursion
	//Time complexity = O(N)
	//Space complexity = O(N)
	//Run time = 2215 ms
	public static int recursive(ListNode A) {
		//edge case
		if( A.next == null) {
			return 1;
		}
		
		//main logic
		if(A.val <= A.next.val) {
			return solve(A.next);
		}
		else {
			return 0;
		}
	}

	//Time complexity = O(n)
	//Space complexity = O(1)
	//Run time = 2063 ms
	public static int solve(ListNode A) {
		//Base condiiton
		if(A.next == null)
			return 1;
		
		//main logic
		int prevVal = Integer.MIN_VALUE;
		ListNode temp = A;
		
		//Loop and check
		while(temp != null) {
			if(temp.val >= prevVal) {
				prevVal = temp.val;
			}else {
				//if single value in decreasing order returns 0
				return 0;
			}
			
			temp = temp.next;
		}
		//if all are non decreasing order returns 1
		return 1;
	}
}
