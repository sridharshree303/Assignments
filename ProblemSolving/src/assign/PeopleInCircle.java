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
		System.out.println();
		int size = li.size();
		int rem = 1;
		while(size > 2) {
			//removed element is last then rem = 1
			//else rem != last[ele]; rem = 0;
			
			int plast = li.get(size-1);
			int i = 0;
			while (i < size / 2) {
				li.remove(i + rem);
				i++;
				
			}
			System.out.println(li);
			size = li.size();
//			System.out.println(size);
			int nlast = li.get(size-1);
//			System.out.println(nlast+" - "+plast+" - "+rem);
			if(nlast != plast) {
				rem = 1;
				li.remove(size-1);
			}else {
				rem = 0;
			}
			
		}
		System.out.println(li.get(0));
	
	}
}

//1234567890
//13
