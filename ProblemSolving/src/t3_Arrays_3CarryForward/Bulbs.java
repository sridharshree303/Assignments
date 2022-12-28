package t3_Arrays_3CarryForward;

public class Bulbs {
	public static void main(String[] args) {
		int [] A = {0,1,0,1};
		System.out.println(bulbs(A));
	}
	
	public static int bulbs(int [] A) {
		int count = 0;
        int n = A.length;
        if(n == 0)
            return 0;
        if(A[0]==0){
            count = 1;
        }
        for(int i=1;i<n;i++){
            if(A[i] != A[i-1])
                count++;
        }
        return count;
	}
}
