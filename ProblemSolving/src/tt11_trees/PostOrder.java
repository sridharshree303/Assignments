package tt11_trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		postOrder(node);
		postorderTraversal2(node);
	}
	
//---------------------------------------------------------------------------------

	// TC = O(n)
	// SC = O(n)
	// LST -- RST -- Root
	public static void postOrder(TreeNode root) {
		TreeNode temp = root;
		// base condition
		if (temp == null) {
			return;
		}

		// main logic
		// Left
		postOrder(root.left);
		// Right
		postOrder(root.right);
		// Root
		System.out.print(root.val + " ");
	}
	
//----------------------------------------------------------------------------------

	public ArrayList<Integer> postorderTraversal(TreeNode A) {
		ArrayList<Integer> list = new ArrayList<>();
		list = postOrder2(A, list);
		return list;
	}
	
	//Using recursion
	//Time complexity = O(n)
	//Space Complexity = O(n)
	public static ArrayList<Integer> postOrder2(TreeNode root,ArrayList<Integer> list) {
		TreeNode temp = root;
		// base condition
		if (temp == null) {
			return null;
		}

		// main logic
		// Left
		postOrder2(temp.left,list);
		// Right
		postOrder2(temp.right,list);
		// Root
		list.add(temp.val);
		
		return list;
	}
	
//--------------------------------------------------------------------------------	

	//Using Stack and Iteterative Approach
	//Time complexity = O(N)
	//Space Complexity = O(N)
	public static ArrayList<Integer> postorderTraversal2(TreeNode A){
		//intialise the Space
		ArrayList<Integer> res = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		
		st.push(A);
		
		//check condition
		while(!st.empty()) {
			TreeNode temp = st.pop();
			res.add(temp.val);
			if(temp.left != null) {
				st.push(temp.left);
			}
			if(temp.right != null) {
				st.push(temp.right);
			}
		}
		
		//Collections.reverse(res);
		//reverse the List
		int n = res.size()-1;
		for(int i=0;i<=n/2;i++ ) {
			int at = res.get(i);
			res.set(i, res.get(n-i));
			res.set(n-i,at);
		}
		
		return res;
	}

}
