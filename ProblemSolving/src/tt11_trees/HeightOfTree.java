package tt11_trees;

public class HeightOfTree {
	// Node to max leaf node
	//TC = O(n)
	//SC = O(n)
	public int maxHeight(TreeNode root) {
		//base case
		if(root == null) {
			return -1;
		}
		
		return Math.max(maxHeight(root.left), 
				maxHeight(root.right))+1;
	}
}
