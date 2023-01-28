package tt11_trees;

public class CountNodes {
	//Time complexity - O(n)
	//Space Complexity - O(n)
	public int countNodes(TreeNode root) {
		if(root == null)
			return 0;
		
		int nodes = countNodes(root.left)+
				countNodes(root.right)+1;
		
		return nodes;
	}
	
	public static void main(String[] args) {
		
	}
}
