package t4_BitManipulations;

public class ConstructBinaryNum {
	public static void main(String[] args) {
		System.out.println(vlue(3,2));
	}
	
	public static int vlue(int A, int B) {
		int sum = 0;
		
		if(A == 0) {
			return 0;
		}
		for(int i=0;i<A;i++) {
			sum = sum + (1 << B+i);
		}
		
		return sum;
	}
}
