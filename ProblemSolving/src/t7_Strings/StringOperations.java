package t7_Strings;

public class StringOperations {
	public static void main(String[] args) {
		System.out.println(solve("AbcaZeoB"));
		System.out.println(solve1("AbcaZeoB"));
	}

	// Time complexity = O(n)
	// Space complexity = O(1)
	public static String solve(String A) {

		// concat
		A = A.concat(A);
		String res = "";
		// Delete Uppercase letters
		// Replce vowels with '#'
		for (int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			if (ch >= 97 && ch <= 122) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					res += '#';
				} else {
					res += ch;
				}
			}
		}
		return res;
	}

	// Time complexity = O(n)
	// Space complexity = O(n)
	public static String solve1(String A) {

		// concat
		A = A.concat(A);
		// Delete Uppercase letters
		// Replce vowels with '#'
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			if (ch >= 97 && ch <= 122) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					sb.append('#');
				} else {
					sb.append(ch);
				}
			}
		}
		return sb.toString();
	}
}
