package t3_Arrays_InterviewPrblms1;

public class Len_ConsectuiveOnes {
	public static void main(String[] args) {
		System.out.println(solve("1110111001"));
	}
	
	//TC = O(n)
	//SC = O(1)
	//RunTime = 927 ms
	public static int solve(String A) {
		int n = A.length();
		int c =0;
		//count the 1 in the array
		for(int i=0;i<n;i++) {
			if(A.charAt(i)=='1')
				c++;
		}
		System.out.println(c);
		//edge case
		if( c==n) return n;
		//count the right and left 1's
		//if i'th index = 0
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(A.charAt(i)=='0') {
				int l = 0,r = 0;
				//count left
				for(int j=i-1;j>=0;j--) {
					if(A.charAt(j)=='1')
						l++;
					else
						break;
				}
	
				//count right
				for(int j=i+1;j<n;j++) {
					if(A.charAt(j)=='1')
						r++;
					else
						break;
				}
				
				int s = r+l;
				System.out.println(l+"--"+r+"="+s);
				//check the max consecutive 1's 
				
				if(s >= ans && c > s )
					ans = r+l+1;
				else if(s >= ans && c==s) {
					ans = r+l;
				}
			}
			
		}
		System.out.println(c+"---"+n);
		return ans;
		
	}
}
