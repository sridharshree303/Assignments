package t9_recursion;

import java.util.ArrayList;

//recursion
public class JosphusPrblm {
	public static void main(String[] args) {
		System.out.println(solve(8,3));
	}
	
	//TC = O(n)
	//SC = O(n)
	public static int solve(int A, int B) {
		//SC = O(n)
		ArrayList<Integer> list = new ArrayList<>();
		int a = 1;
		//TC = O(n)
		for(int i=0;i<A;i++) {
			list.add(a++);
		}
		int len = list.size();
		//TC = O(n)
		//SC = O(n)
		return recursive(list, len, B-1, 0);
	}
	
	public static int recursive(ArrayList<Integer> list,int len,int B,int start) {
		if(len == 1) {
			return list.get(0);
		}
		
		int i = (start+B)%len;
		list.remove(i);
		len--;
		return recursive(list,len,B,i);
	}
}
