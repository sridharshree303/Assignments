package tt11_trees;

public class SumOfAllNodes {
	
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		
	}
	//Time complexity = 0(n)
	//Space complexity = O(n
	public int sumNodes(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int sum = sumNodes(root.left)+
				sumNodes(root.right)+root.val;
		
		return sum;
	}
}
