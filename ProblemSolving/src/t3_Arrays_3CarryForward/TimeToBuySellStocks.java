package t3_Arrays_3CarryForward;

public class TimeToBuySellStocks {
	public static void main(String[] args) {
		int [] a = {1,4,6,2};
		System.out.println(maxProfit(a));
	}

	//TC = O(n)
	//SC = O(1)
	public static int maxProfit(final int[] A) {
		int n = A.length;
        //edge case
        if(n < 2){
            return 0;
        }
        //change in price and max profit 
        int maxprofit = 0;
        int min = A[0];
        for(int i=0;i<n;i++) {
        	//updating min price
        	if(A[i]<min)
        		min = A[i];
        	//updating max profit
        	if(A[i]-min > maxprofit) {
        		maxprofit = A[i]-min; 
        	}
        }
        return maxprofit; //5 (1-6)
	}
}
