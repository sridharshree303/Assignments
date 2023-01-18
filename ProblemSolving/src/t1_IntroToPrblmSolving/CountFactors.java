package t1_IntroToPrblmSolving;

public class CountFactors {
	
	public static void main(String[] args) {
//		System.out.println(solve((long)123));
		System.out.println(solve2(100));
	}
	
	// Math.sqrt(int)
	// Time Complexity : O(sqrt(N))
	// Space Complexity : O(1)
	public static int solve2(long B) {
		int count = 0;
		for(int i = 1; i <= Math.sqrt(B); i++) {
			if(B % i == 0) {
				if(i == B/i) {
					count++;
					//System.out.println(i);
				}else {
					//System.out.println(i);
					count = count+2;
				}
			}
		}
		return count;
	}
	
	//loop with conditionals
	// Time Complexity : O(n) 
	// Auxiliary Space : O(1)
    public static int solve(Long A) {
    	int count = 0;
    	long cofact = 0;
    	for(int i=1; i <= A ; i++) {
    		//System.out.println();
    		if(A % i == 0) {
    			cofact = (int) (A / i);
    			
    			if(i == cofact) {
    				count++;
    				System.out.println(count+" - "+ i);
        			break;
        		}else if(i > cofact ) {
        			break;
        		}else {
        			//count = count+2;
        			count++;
        			System.out.println(count+" - "+i);
        			count++;
        			System.out.println(count+" - "+ cofact);
        		}
    		}
    		
    	}
    	return count;
    }
}
