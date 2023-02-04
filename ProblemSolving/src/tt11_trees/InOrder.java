package tt11_trees;

import java.util.ArrayList;

public class InOrder {
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		// inOrder(node);
		System.out.println(inorderTraversal(node));
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

	public static ArrayList<Integer> inorderTraversal(TreeNode A) {
		ArrayList<Integer> list = new ArrayList<>();
		list = inOrder2(A, list);
		return list;
	}

	public static ArrayList<Integer> inOrder2(TreeNode root, ArrayList<Integer> list) {

		TreeNode temp = root;
		// Base condition
		if (temp == null)
			return null;

		// Main logic
		// left
		inOrder2(temp.left, list);
		// root
		list.add(temp.val);
		// right
		inOrder2(temp.right, list);

		return list;
	}
}
