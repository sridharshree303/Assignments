package t7_Strings;

public class ToggleChars {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(solve(str));
	}
	
	//TC = O(n)
	//SC = O(1)
	public static String solve(String str) {
		StringBuilder sb = new StringBuilder(str);
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			sb.setCharAt(i, (char) (sb.charAt(i)^(1<<5)));
		}
		return sb.toString();
	}
}
