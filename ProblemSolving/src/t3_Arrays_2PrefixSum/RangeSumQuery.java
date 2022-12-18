package t3_Arrays_2PrefixSum;

public class RangeSumQuery {
	public static void main(String[] args) {
		
	}
	
	//TimeComplexity = O(n+q)
	//Space Complexity = O(n) -> creating new array inside
	public static int prefixSum(int arr[],int q,int l,int r) {
		int pf[] = new int[arr.length];
		pf[0] = arr[0];
		for(int i=1;i<arr.length;i++) {  //timeComplexity = O(n)
			pf[i] = pf[i-1]+arr[i];
		}
		
		for(int i=0;i<q;i++) {	//time complexity = O(q)
			//l,r are in pool
			int sum;
			if(l == 0) {
				sum = pf[r];
			}else {
				sum = pf[r]-pf[l-1];
			}
			return sum;
		}
		return 0;
	}
	
	// can we think in terms of n>q and q>n
	// TC : O(n+q)
}
