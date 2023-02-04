package tt11_trees;

public class CountNodes {

	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		System.out.println(countNodes(node));
	}

	// Time complexity - O(n)
	// Space Complexity - O(n)
	public static int countNodes(TreeNode root) {

		if (root == null)
			return 0;

		int nodes = countNodes(root.left) + countNodes(root.right) + 1;

		return nodes;
	}

}
