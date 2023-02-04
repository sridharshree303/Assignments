package tt11_trees;

public class CountingNodes {
	public static void main(String[] args) {
		BinaryTree bn = new BinaryTree(4);
		BinaryTree bnr = new BinaryTree(2);
		
		bn.root.left = new TreeNode(5);
		bn.root.right = bnr.root;
		
		bnr.root.left = new TreeNode(3);
		bnr.root.right = new TreeNode(6);
		
		System.out.println(solve(bn.root));
	}
	
	//Driver code
	public static int solve(TreeNode A) {
		
		int count = recursive(A, Integer.MIN_VALUE);
		
		return count;
    }
	
	public static int recursive(TreeNode A, int max) {
		if(A == null) {
			return 0;
		}
		
		if(A.val > max) {
			return recursive(A.left,A.val)+recursive(A.right, A.val)+1;
		}else {
			return recursive(A.left,max)+recursive(A.right, max);
		}
	}
}
