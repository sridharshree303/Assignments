package tt10_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LnlistNode {
	
	static Node head;
	
	//If outside class 
	static class Node{
		int data;
		Node next;
		
		
		//Constructor
		Node(int data){
			this.data = data;
			this.next = null;
		}

	}
	
	public void push(int data) {  //push or addFirst
		//Initialize new node
		Node newData = new Node(data);
		//change the head position
		newData.next = head;
		//make new head 
		head = newData;
	}
	
	public void add(int data) {  // add or addLast
		
		//intiaize new node
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		//Iterate and get last node to update
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		//link last new node 
		last.next = newNode;
		return;
	}
	
	//Time complexity - O(N)
	//Space complexity - O(N)
	public void add(int index, int newData) { // add at specific location
		//check the head is null
		if(head == null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		
		//initialize the newnode
		Node newNode = new Node(newData);

		//loop untill index position k-1;
		Node temp = head;
		for(int i=0;i<index-1;i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		return;
	}
	
	//Time complexity - O(1)
	//Space complexity - O(1)
	public void set(Node prevNode, int newData) { // set or replace node
		//check the node is null
		if(prevNode == null) {
			System.out.println(" Node Not found");
			return ;
		}
		
		//swap the data
		Node cur = prevNode.next;
		cur.data = newData;
		prevNode.next = cur;
		
	}

	//Time complexity - O(N)
	//Space complexity - O(1)
	public  void printList() {
		Node tt = head;
		while(tt != null) {
			System.out.println(tt.data);
			tt = tt.next;
		}
	}
	
	//Time complexity - O(N)
	//Space complexity - O(1)
	public static void printList(Node n) {
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void nodePrint2() {
		LnlistNode sample = new LnlistNode();
		sample.add(10);
		sample.push(20);
		sample.add(30);
		sample.add(2, 40);
		sample.set(head, 50);
		sample.printList();
	}
	
	public static void nodePrint() {
		//created nodes and data
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//assigning pointers
		head.next = second;
		second.next = third;
		third.next = null;
		
		printList(head);
		
	}
	
	public static void main(String[] args) {
		//Assign some values
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.push(10);
		list.add(15);
		list.add(20);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//print Node List
		nodePrint();
		nodePrint2();
	
	}
}
