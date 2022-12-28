package assign;

import java.util.ArrayList;

public class PeopleInCircle {
	public static void main(String[] args) {
		int n = 100;
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			li.add(i + 1);
		}

		for (int i = 0; i < n; i++) {
			 System.out.print(li.get(i)+" ");
		}
	}
}

//1234567890
//13
