package t7_Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		//String[] ss = {"SridharSri","SridharKolluru","SridharNaidu"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList("SridharSri","SridharKolluru","SridharNaidu"));
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(list));
		System.out.println(lcp.longestCommonPrefix2(list));
	}
	
	
	public String longestCommonPrefix(ArrayList<String> A) {
        //Assigned the first string 
		StringBuilder s = new StringBuilder(A.get(0)); //abab
		System.out.println(s.toString());
        //loop the first string index 0 to N
        for(int i=1;i<A.size();i++){
        	//
            while(A.get(i).indexOf(s.toString())!=0){
                s = s.deleteCharAt(s.length()-1);
                if(s.length() == 0)
                return "";
            }
        }
        return s.toString();
    }
	
	//Time complexity = O(K*N)
	//Space complexity = O(1)
	public String longestCommonPrefix2(ArrayList<String> A) {
		String ans = ""; 
		int n = A.size(); 
		
		//min length string 
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {     //O(n) + O(K*N)
			int len = A.get(i).length(); 
			min = Math.min(min, len);
		}
		
		//compare the every string index vertically
		for(int i=0;i<min;i++) {     //O(k)  -- min length of string array
			char ch = A.get(0).charAt(i); 
			boolean bn = true; 
			//check every string ith chars
			for(int j=1;j<n;j++) {    //O(N)
				if(A.get(j).charAt(i) != ch) {
					bn = false;
					break;
				}
			}
			
			//returns when chars are not equile during iterating
			if(bn) {
				ans += ch;
			}else {
				break;
			}
		}
		
		return ans;
	}
}
