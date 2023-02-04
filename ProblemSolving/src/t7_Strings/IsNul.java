package t7_Strings;

public class IsNul {
	public static void main(String[] args) {
		String str = "Sridhar123";
		
		char[] cc = str.toCharArray();
		System.out.println(solve(cc));
		
		
		// Using regex
		// String s = new String(A);
        // if (s.matches("[a-zA-Z0-9]*")) return 1;
        // return 0;
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int solve(char[] A) {
        int n = A.length;
        for(int i=0;i<n;i++){
            char ch = A[i];
            if((ch >= 48 && ch <= 58) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ){
                continue;
            }
            else {
                return 0;
            }
            
        }
        return 1;
    }
}
