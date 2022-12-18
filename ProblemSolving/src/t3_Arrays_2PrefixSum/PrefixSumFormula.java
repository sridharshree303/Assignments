package t3_Arrays_2PrefixSum;

public class PrefixSumFormula {
	
	// prefix sum of N range formula
	// prefixSum[i] = prefixSum[i-1]+array[i]
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,6,5};
		int l = 2, r = 4;
		System.out.println(rangeSum(arr,l,r));
	}
	
	//given n array of elements and a starting index and a ending index.
	//Find the sum in that range
	public static int rangeSum(int arr[], int l, int r) {
		//loop from l-r and find sum
		//Time complexity = O(n)
		//Space complexity = O(1)
		int sum = 0;
		for(int i=l;i <= r;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//Given n array elements and a starting index and a ending index.
	//Find sum in that range . You are given Q queries.
	//q = 3
	//Time complexity = O(q*n)
	public static int multipleQuries(int arr[],int q) {
		for(int i=0;i < q; i++){
			//l,r as input
			int l=0,r=0;
			int sum = 0;
			for(int j=l;j<=r;j++) {
				sum += arr[j];
			}
			return sum;
		}
		return 0;
	}
}
