package tt11_trees;

public class HeightOfTree {
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		
		System.out.println(maxHeight(node));
	}
	// Node to max leaf node
	//TC = O(n)
	//SC = O(n)
	public static int maxHeight(TreeNode root) {
		//base case
		if(root == null) {
			return 0;
		}
		
		return Math.max(maxHeight(root.left),maxHeight(root.right))+1;
	}
}
