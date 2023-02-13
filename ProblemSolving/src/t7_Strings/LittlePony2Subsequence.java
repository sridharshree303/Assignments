package t7_Strings;

public class LittlePony2Subsequence {
	public static void main(String[] args) {
		String str = "adcdsfhjbgj";
		System.out.println(solve(str));
	}
	
	public static String solve(String A) {
		char ch1 = 'a' ;
		char ch2 = 'a' ;
		int chp1 ;
		
		for(int i=0;i<A.length();i++) {
			ch1 = minValue(ch1, A.charAt(i));
		}
		
		chp1 = A.indexOf(ch1);
		
		for(int i=chp1+1;i<A.length();i++) {
			ch2 = minValue(ch2, A.charAt(i));
		}
		
		String str = ch1+""+ch2;
		
		return str;
	}
	
	public static char minValue(char a, char b) {
		if(a > b) {
			return b;
		}
		return a;
	}
}	
