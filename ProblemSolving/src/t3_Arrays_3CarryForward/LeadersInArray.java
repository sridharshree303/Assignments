package t3_Arrays_3CarryForward;

//Leaders in a array
//Given an array, you have to find all leaders in arr[]
//All element is a leader, if it is greater than all elements on its right side
//Note : arr[n-1] is always on its right side

// arr[] = {15,-1,7,5,4,2,3}
// ans = 5;
public class LeadersInArray {
	public static void main(String[] args) {
		int arr[] = {15,-1,7,5,4,2,3};
		System.out.println(maxLeader(arr));
	}
	
	// approach is move from right to left
	// because (n-1) is always a leader
	// Time complexity = O(n)
	// Space complexity = O(1)
	public static int maxLeader(int arr[]) {
		int n = arr.length-1;
		int curMax = arr[n];
		int count = 1;
		for(int i = n-1; i>=0;i--) {
			if(arr[i] > curMax) {
				count++;
				curMax = arr[i];
			}
		}
		return count;
	}
}
