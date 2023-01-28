package tt11_trees;


//Binary Tree in Java

//creating a node that holds the data, address of the left child, and the address of the right child
class Node {
	int key;
	Node left, right;

	//setting data in the node
	public Node(int item) {
		key = item;
		//setting left and right child equal to NULL
		left = right = null;
	}
}

public class BinaryTree {

	Node root;

	//inserting data into the binary tree
	BinaryTree(int key) {
		root = new Node(key);
	}

	//set root NULL when the binary tree is created for the first time
	BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {

		//creating a new instance of Binary Tree
		BinaryTree tree = new BinaryTree();

		//inserting into the binary tree
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
	}
}