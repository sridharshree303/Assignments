package t4_BitManipulations2;

public class NoOfBits {
	public static void main(String[] args) {
		System.out.println(numOfBits(6));
	}
	
	public static int numOfBits(int A) {
		int count=0;
		//Approach-1
		//By Math
		//TC = O(log n)
		//SC = o(1)
		while(A > 0) {
			if(A%2 ==1) count++;
			A = A/2;
		}
		//return count;
		
		//Approach-2
		//By bit manipulation
		//TC = O(log n)
		//SC = O(1)
		while(A>0) {
			if((A&1)==1) count++;
			A = (A>>1);
		}
		return count;
	}
}
