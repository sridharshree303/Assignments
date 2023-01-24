package t9_recursion;

public class Power {
	public static void main(String[] args) {
		int x = powerVal(2,15);
		System.out.println(x);//32
		int y = powerVal1(2,15);
		System.out.println(y);//512
	}
	
	//TC = O(n)
	//SC = O(n)
	private static int powerVal(int A, int B) {
		// TODO Auto-generated method stub
		System.out.println("dd");
		if(B == 0) return 1;
		return powerVal(A, B-1)*A;
	}
	
	//TC = O(log n)
	//SC = O(n)
	private static int powerVal1(int A,int B) {
		System.out.println("dd");
		//stack overflow if this recursive above base condition
		//int temp = powerVal1(A, B/2);
		
		if(B == 0)
			return 1;
		
		int temp = powerVal1(A, B/2);
		if(B%2 == 0)
			return temp*temp;
		else
			return A*temp*temp;
	}
}
