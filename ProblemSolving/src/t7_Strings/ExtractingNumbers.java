package t7_Strings;

public class ExtractingNumbers {
	public static void main(String[] args) {
		String str = "a12b12c12d";
		System.out.println(solve(str));
	}
	
	public static Long solve(String A) {
		String s = "0";
		Long sum = (long) 0;
	
		
		for(int i=0;i<A.length();i++) {
			char ch = A.charAt(i);
		
			if(ch >= 48 && ch <= 57) {
				s = s+ch;
			}
			
			if(ch > 57 || i == A.length()-1) {
			
				long l= Long.parseLong(s);
		
				sum = sum + l;
				s = "0";
			}
			
		}
		
		return sum;
		
	}
}
