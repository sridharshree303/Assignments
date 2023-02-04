package t7_Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentMarks {
	public static void main(String[] args) {
		String[] aa = { "adarsh80", "harsh95", "shivam95","raghav100" };
		System.out.println(solve(aa));
	}

	public static ArrayList<String> solve(String[] A) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], separater(A[i]));
		}

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, (i1, i2) -> 
					i2.getValue().compareTo(i1.getValue()));
		
		
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			arr.add(list.get(i).getKey());
		}

		return arr;
	}

	public static int separater(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				s = str.charAt(i) + "" + s;
			} else {
				break;
			}
		}

		return Integer.parseInt(s);
	}
}
