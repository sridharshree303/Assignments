package tt11_trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightOfTree {
	public static void main(String[] args) {
		TreeNode node = BinaryTree.binaryTreeSample();
		
		System.out.println(maxHeight(node));
		System.out.println(heightOfTree(node));
	}

	//Iterative approach
	//TC = O(n)
	//SC = O(w) ~ O(n) 
	public static int heightOfTree(TreeNode root) {
		//base case 
		if(root == null) {
			return 0;
		}
		
		//create a queue and intialise height 
		Queue<Object> q = new ArrayDeque<>();
		q.add(root);
		int height = 0;
		
		while(q.size() != 0) {
			
			//take node count
			int nodeCount = q.size();
			height++;
			
			//loop and deque and enqueue nodes
			while(nodeCount > 0) {
			
				TreeNode node = (TreeNode) q.peek();
				//deque
				q.poll();
				
				//enqueue
				if(node.left != null) {
					q.add(node.left);
				}
				
				if(node.right != null) {
					q.add(node.right);
				}
				
				nodeCount--;
			}
		}
		return height;
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
