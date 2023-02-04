package t7_Strings;

public class C1_StringIntro {
	public static void main(String[] args) {
		System.out.println(toggleChars("SriDhAr"));
	}
	
	public static String toggleChars(String str) {
		char[] a = str.toCharArray();
		int n = a.length;
		for(int i=0;i<n;i++) {
			a[i] = (char) (a[i]^(1<<5)); //sRIdHaR
		}
		return new String(a);
	}
}

//String are immutable but not for java
//
