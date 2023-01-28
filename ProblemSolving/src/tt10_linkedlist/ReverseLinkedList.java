package tt10_linkedlist;

import java.util.ArrayList;

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
	
	//using arrayList
	//Time complexity = O(n)
	//Space Complexity = O(1)
	public static void solve2(ListNode A) {
		ArrayList<Integer> list = new ArrayList<>();
		
		while(A != null) {
			list.add(A.val);
			A = A.next;
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	//by using recursion
	//Time complexity = O(n)
	//Space complexity = O(n)
	//Driver code
	 public static void solve(ListNode A) {
		  printNodes(A);
		  System.out.println();
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
