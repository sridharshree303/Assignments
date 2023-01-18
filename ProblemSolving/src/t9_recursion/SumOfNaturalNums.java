package t9_recursion;

public class SumOfNaturalNums {
	public static void main(String[] args) {
		System.out.println(sumOf(10));
	}
	
	//TC = O(N)
	//SC = O(N)
	public static int sumOf(int n) {
		//base condition
		if(n==1)
			return 1;
		//main logic
		return sumOf(n-1)+n;
	}

}
