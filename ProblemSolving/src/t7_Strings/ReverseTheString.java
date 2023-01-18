package t7_Strings;

public class ReverseTheString {
	//TC = O(n);
	//SC = O(1);
	public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        return sb.toString();
    }
}
