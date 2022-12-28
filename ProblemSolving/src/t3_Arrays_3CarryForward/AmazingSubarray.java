package t3_Arrays_3CarryForward;

public class AmazingSubarray {
	public static void main(String[] args) {
		System.out.println(solve("ABECaaa"));
	}
	
	public static int solve(String A) {
		int count = 0;
        int n = A.length();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o'||ch == 'u'||ch == 'A' || ch == 'E' || ch=='I' || ch == 'O'||ch == 'U'){
                count += (n-i);
            }
            count = count % 10003;
        }
        return count;
	}
}
