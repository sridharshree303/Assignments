package t5_Maths;

public class Leapyeariii {
	
	public static void main(String[] args) {
		int A =1990;
		System.out.println(solve(A));
	}
	
	//TC = O(1)
	//SC = O(1)
	public static int solve(int A) {
		if(A%400==0) {
			return 1;
		}else if(A%4==0 && A%100 != 0)
			return 1;
		
		return 0;
	}
}
