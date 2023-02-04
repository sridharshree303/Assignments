package tt11_trees;

import java.util.ArrayList;
import java.util.Stack;

//maifestation
//preorder(TreeNode node)

//main logic
//print root
//preorder(root.left)
//preorder(root.right)

//Base case
//if(root == null) -> return ;

public class PreOrder {

	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		//preOrder(node);
		System.out.println(preorderTraversal2(node));
	}

	// TC = O(n)
	// SC = O(n)
	// Root -- LST -- RST
	public static void preOrder(TreeNode root) {
		TreeNode temp = root;
		// Base condition
		if (temp == null)
			return;
		// Main logic
		// print root
		System.out.print(temp.val + " ");
		// print left
		preOrder(temp.left);
		// print right
		preOrder(temp.right);
	}

	//Using stack and Iterative
	public static ArrayList<Integer> preorderTraversal2(TreeNode A) {
		// intialise the Space
		ArrayList<Integer> res = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();

		st.push(A);

		// check condition
		while (!st.empty()) {
			TreeNode temp = st.pop();
			if (temp.right != null) {
				st.push(temp.right);
			}
			res.add(temp.val);
			if (temp.left != null) {
				st.push(temp.left);
			}
			
		}

		// Collections.reverse(res);
		// reverse the List
		//int n = res.size() - 1;
		//for (int i = 0; i <= n / 2; i++) {
			//int at = res.get(i);
			//res.set(i, res.get(n - i));
			//res.set(n - i, at);
		//}

		return res;
	}

	// using recursion
	// TC = O(n)
	// TC = O(n)
	public static ArrayList<Integer> preorderTraversal(TreeNode A) {

		ArrayList<Integer> list = new ArrayList<>();
		list = preOrder2(A, list);
		return list;
	}

	// root -- left -- right
	public static ArrayList<Integer> preOrder2(TreeNode A, ArrayList<Integer> list) {

		TreeNode temp = A;

		// base condition
		if (temp == null) {
			return null;
		}

		// main logic
		list.add(temp.val);
		preOrder2(temp.left, list);
		preOrder2(temp.right, list);
		return list;
	}

}

/*
 * -- Binary Tree
 * 
 * (A) / \ (B) (C) / \ / \ (D)(E) (F)(G)
 * 
 * Pre Order -> Root,LST,RST -- ABDECFG In Order -> LST,Root,RST -- DBEAFCG Post
 * Order -> LST,RST,Root -- DEBFGCA
 * 
 */