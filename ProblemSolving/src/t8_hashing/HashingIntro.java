package t8_hashing;

import java.util.HashMap;

public class HashingIntro {
	public static void main(String [] args) {
		hasmapIntro();
	}
	
	public static void hasmapIntro() {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.put(1, 5);
		map.put(4, 3);
		map.put(3, 4);
		System.out.println(map);
	}
	
}
