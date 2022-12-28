package assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fourth {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(li);
		System.out.println(solve(list));
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> B = new ArrayList<>();
		int l = 1;
		int r = 1;
		
		for (int i = 0; i < A.size(); i++) {
			B.add(1);
		}
		
		for(int i=0;i<A.size()-1;i++) {
			l *= A.get(i);
			int rd = A.size()-i-1;
			r *= A.get(rd);
			B.set(i+1, l);
			B.set(rd-1, r);
		}

		return B;
	}
}
