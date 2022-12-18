package t3_Arrays_2PrefixSum;

public class EquilibriumIndex {
	//time complexity = O(n)
	//space complexity = O(1) or O(n)
	public static void main (String [] args) {
		int count = 0 ;
		int left = 0, right = 0;
		int n = 0; //length of array
		for ( int i =0; i < n; i++) {
			if(i == 0 ) {
				left = 0;
			}else {
				//left = PF[i-1]; 
			}
			
			//right = PF[n-1]-PF[i]
			if(left == right)
				count++;
		}
	}
}
