package tt10_linkedlist;

import tt10_linkedlist.InsertLinkList.ListNode;

//class ListNode {
//	public int val;
//	public ListNode next;
//
//	ListNode(int x) {
//		val = x;
//		next = null;
//	}
//}

public class Solution {
	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		ListNode head1 = new ListNode(3);
		ListNode head2 = new ListNode(3);
		ListNode head3 = new ListNode(6);
		ListNode head4 = new ListNode(7);
		ListNode head5 = new ListNode(8);
		ListNode head6 = new ListNode(7);
		ListNode head7 = new ListNode(3);
		ListNode head8 = new ListNode(7);
		
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = head7;
		head7.next = head8;
		
		System.out.println(solve(head,2,3));
		PrintLinkList(head);
	}
	
	private static void PrintLinkList(ListNode head) {
		// TODO Auto-generated method stub
		while(head != null) {
			System.out.print(head.val+" --> ");
			head = head.next;
		}
	}

	public static ListNode solve(ListNode A, int B, int C) {
        //assign to curr
        ListNode curr = A;
        
        while(curr != null){
            ListNode prev = curr;
            int tempB = B;
            int tempC = C;
            
            //skip
            while(curr != null && tempB != 0 ){
                tempB--;
                prev = curr;
                curr = curr.next;
            }
            
            //del
            while(curr != null && tempC != 0){
                tempC--;
                ListNode temp = curr;
                prev.next = curr.next;
                curr = prev.next;
                temp.next = null;
                temp = null;
            }
        }
        
        return A;
    }
	
}
