package tt11_trees;

//maifestation
		//preorder(TreeNode node)
	
	//main logic
		//print root
		//preorder(root.left)
		//preorder(root.right)
	
	//Base case
		//if(root == null) -> return ;

public class PreOrder {
	public void preOrder(TreeNode root) {
		if(root == null)
			return ;
		
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}
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