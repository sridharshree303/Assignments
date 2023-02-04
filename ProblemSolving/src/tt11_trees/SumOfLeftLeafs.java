package tt11_trees;

public class SumOfLeftLeafs {
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		System.out.println(solve(node));
	}
	
	//Using recursion
	//Time complexity = O(n)
	//Space complexity = O(n)
	public static int solve(TreeNode A) {
		//base condition
		if(A == null)
			return 0;
		
		//left leaf values
		int ad = isLeaf(A.left) ? A.left.val : 0;
		
		//returns sum by recursion
		int sum = solve(A.left)+solve(A.right)+ad ;
	
		return sum ;
    }
	
	//checks whether it is left leaf or not
	public static boolean isLeaf(TreeNode aa) {
		if(aa == null) {
			return false;
		}
		
		if(aa.left == null && aa.right == null) {
			return true;
		}
		
		return false;
	}
	
}
