package tt11_trees;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	//constructor
	public TreeNode(int key) {
		this.val = key;
		this.left = null;
		this.right = null;
	}
	
//	public static void main(String[] args) {
//		TreeNode root = new TreeNode(0);
//		root.left = new TreeNode(1);
//		root.right = new TreeNode(2);
//	}
}




/* -- Binary Tree
 * 
 * 		 (A)
 * 		/   \
 *    (B)	(C)
 * 	 /  \   /  \
 * (D) (E) (F) (G)
 * 
 * Pre Order -> Root,LST,RST -- ABDECFG
 * In Order  -> LST,Root,RST -- DBEAFCG
 * Post Order -> LST,RST,Root -- DEBFGCA
 * 
 */
