package t3_Arrays_3CarryForward;

//count pair of AG
// array = [b a a g d c a g]
// [1,3],[1,7],[2,3],[2,7],[6,7]
public class CountPairs {
	public static void main(String[] args) {
		char a[] = new char[]{'b','a','a','g','d','c','a','g','g'};
		
		System.out.println(pairCount(a));
	}
	
	//Time complexity = O(n^2)
	//space complexity = O(1)
	public static int pairCount1(char c[]) {
		int n = c.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(c[i]=='a') {
				for(int j =i+1;j<n;i++) {
					if(c[j]=='g') {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	//counts the pairs based on 'g'
	//Time complexity = O(n)
	//space complexity = O(1)
	public static int pairCount (char a[]) {
		int aCount = 0;
		int pairs = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] == 'a') {
				++aCount;
			}
			if(a[i]=='g') {
				pairs += aCount;
			}
		}
		return pairs;
	}
	
}
