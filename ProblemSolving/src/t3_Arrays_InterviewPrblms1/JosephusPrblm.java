package t3_Arrays_InterviewPrblms1;

public class JosephusPrblm {
	public static void main(String[] args) {
		System.out.println(solve1(64));
	}
	//TC = O(1)
	public static int solve(int n) {
		int num = 0;
		for(int i=0;i<=n/2;i++) {
			int ss = (int) Math.pow(2, i);
			//System.out.println(ss);
			if(ss <= n)
				num = n-ss;
			else break;
		}
		//System.out.println(num);
		int val = 1+(num*2);
		return val;
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int solve1(int A) {
		int num=0;
		int max=0;
		int i=0;
		while(num<=A) {
		   max = num;
		   num = 1<<i; 
		   i++;
		}
		int aa = A-max;
		max = 1+aa*2;
		
		return max;
	}
}
