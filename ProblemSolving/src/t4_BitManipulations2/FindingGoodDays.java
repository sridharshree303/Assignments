package t4_BitManipulations2;

public class FindingGoodDays {
	public static void main(String[] args) {
		System.out.println(solve(8));
	}
	
	//TC = O(log n)
	//SC = O(1)
	public static int solve(int A) {
		int days = 0;
		while(A>0) {
			if((A&1)==1) {
				days++;
			}
			A = A/2;
		}
		return days;
	}
}
