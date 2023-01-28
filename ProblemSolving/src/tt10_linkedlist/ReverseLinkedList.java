package tt10_linkedlist;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		
		A.next = B;
		B.next = C;
		C.next = D;
		
		solve(A);
	}
	
	//by using recursion
	 public static void solve(ListNode A) {
		  printNodes(A);
	 }
	 
	 public static void printNodes(ListNode A) {
		//base condition
		  if(A == null)
			  return ;
		//main Logic
		 printNodes(A.next);
		 System.out.print(A.val+" ");
	 }
}
