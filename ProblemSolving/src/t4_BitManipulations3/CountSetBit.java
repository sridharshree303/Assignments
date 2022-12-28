package t4_BitManipulations3;

public class CountSetBit {
	public static void main(String[] args) {
		System.out.println(setBitCount(15));
		// 15 = 4 bits
		// 20 = 2 bits
		System.out.println(perfectSquare(32));
	}
	
	//TC = O(1)
	public static int setBitCount(int n) {
		int count =0;
		while(n>0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	
	//If number of bits is 1
	//It is a perfect power of 2
	public static String perfectSquare(int a) {
		String res = setBitCount(a) == 1 ? "Yes" : "No";
		return res;
	}
}
