package tt11_trees;

//Binary Tree in Java

//creating a node that holds the data, address of the left child, and the address of the right child
//class TreeNode {
//	int key;
//	TreeNode left, right;
//
//	// setting data in the node
//	public TreeNode(int item) {
//		key = item;
//		// setting left and right child equal to NULL
//		left = right = null;
//	}
//}

public class BinaryTree {

	TreeNode root;

	// inserting data into the binary tree
	BinaryTree(int key) {
		root = new TreeNode(key);
	}

	// set root NULL when the binary tree is created for the first time
	BinaryTree() {
		root = null;
	}

	public static TreeNode binaryTreeSample() {
		// creating a new instance of Binary Tree
		BinaryTree tree = new BinaryTree(1);
		BinaryTree lst = new BinaryTree(2);
		BinaryTree rst = new BinaryTree(3);
		BinaryTree rst1 = new BinaryTree(5);

		// inserting into the binary tree root
		tree.root.left = lst.root;
		tree.root.right = rst.root;

		// inserting into the left binary tree
		lst.root.left = new TreeNode(4);
		lst.root.right = rst1.root;

		// inserting into the right binary tree
		rst.root.left = new TreeNode(6);
		rst.root.right = new TreeNode(7);
		
		
		rst1.root.left = new TreeNode(9);
		

		return tree.root;
	}

	// TC = O(n)
	// SC = O(n)
	// Root -- LST -- RST
	public static void preOrder(TreeNode root) {
		TreeNode temp = root;
		// Base condition
		if (temp == null)
			return;
		// Main logic
		// print root
		System.out.print(temp.val + " ");
		// print left
		preOrder(temp.left);
		// print right
		preOrder(temp.right);
	}

	// TC = O(n)
	// SC = O(n)
	// LST -- Root -- RST
	public static void inOrder(TreeNode root) {
		
		TreeNode temp = root;
		// Base condition
		if (temp == null)
			return;
		
		// Main logic
		// print left
		inOrder(temp.left);
		// print root
		System.out.print(temp.val + " ");
		// print right
		inOrder(temp.right);
	}
	
	//TC = O(n)
	//SC = O(n)
	//LST -- RST -- Root
	public static void postOrder(TreeNode root) {
		TreeNode temp = root;
		//base condition
		if(temp == null) {
			return ;
		}
		
		//main logic
		//Left
		postOrder(root.left);
		//Right
		postOrder(root.right);
		//Root
		System.out.print(root.val+" ");
	}

	public static void main(String[] args) {
		TreeNode tree = binaryTreeSample();

		// Tree transversal printing
		preOrder(tree);   // 1 2 4 5 3 6 7
//		inOrder(tree);    // 4 2 5 1 6 3 7 
//		postOrder(tree);  // 4 5 2 6 7 3 1 
	}
}