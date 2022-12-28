package assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(li);
		System.out.println(solve(list, 3, 3));
	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, int B, int C) {
		
		ArrayList<ArrayList<Integer>> outList = new ArrayList<ArrayList<Integer>>();
		int n = 0;
		for(int i =0;i<B;i++) {
			ArrayList<Integer> inList = new ArrayList<>();
			for(int j=0;j<C;j++) {
				inList.add(A.get(n++));
			}
			outList.add(inList);
		}
		return outList;
	}
}
