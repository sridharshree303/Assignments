package t9_recursion;

public class KthSymbol {
	public static void main(String[] args) {
		System.out.println(solve(4,3));
	}
	
	//Manifetstation - (A-1,B/2)
	//Main logic
	//Base condition - if(A == 1 || B == 0)
	//TC = O(A) is worst case or O(B) = O(log B)
	public static int solve(int A, int B) {
		
		//base case
		if(A == 1 || B == 0)
			return 0;
		int creater = solve(A-1,B/2);
		
		if(creater == 0) {
			if(B%2 == 0)  // first child
				return 0;
			else 			//second child
				return 1;
		}else {
			if(B%2 == 0)  // first child
				return 1;
			else 			//second child
				return 0;
		}
			
	}
	
}
