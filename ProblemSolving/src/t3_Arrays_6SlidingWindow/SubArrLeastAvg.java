package t3_Arrays_6SlidingWindow;

public class SubArrLeastAvg {
	public static void main(String[] args) {
		int[] a = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		int B = 9;
		System.out.println(solve2(a, B));
	}


	//using sliding window
    //TC=O(n)
    //SC=0(1)
	//Running time = 1440ms
	public static int solve2(int[] A, int B) {
		int N = A.length;
		int i = 0;
		int j = B - 1;
		int avgInd = 0;
		int minAvg = Integer.MAX_VALUE;
		int minSum = Integer.MAX_VALUE;
		int slidesum = 0;
		for (int x = 0; x < B; x++) {
			slidesum += A[x];
		}
		while (j < N) {
			int sum = 0;
			int avg = 0;
			if (i == 0) {
				sum = slidesum;
			} else {
				sum = slidesum - A[i-1] + A[j];
			}

			// used bit operator
			avg = sum / B;
			System.out.println(sum + " - " + avg);
			if (avg <= minAvg && sum < minSum) {
				minSum = sum;
				avgInd = i;
				minAvg = avg;
			}
			slidesum = sum;
			i++;
			j++;
		}
		return avgInd;
	}

	// TC = O(N)
	// SC = O(1)
	// Running time = 4590 ms
	public int solve1(int[] A, int B) {
		int N = A.length;
		int i = 0;
		int j = B - 1;
		int avgInd = 0;
		int minAvg = Integer.MAX_VALUE;
		int minSum = Integer.MAX_VALUE;
		while (j < N) {
			int sum = 0;
			int avg = 0;
			for (int x = i; x <= j; x++) {
				sum += A[x];
			}
			// used bit operator
			avg = sum >> B;
			if (avg <= minAvg && sum < minSum) {
				minSum = sum;
				avgInd = i;
				minAvg = avg;
			}
			i++;
			j++;
		}
		return avgInd;
	}

	// TC = O(N)
	// SC = O(1)
	// Running time = 6036 ms
	public static int solve(int[] A, int B) {
		int N = A.length;
		int i = 0;
		int j = B - 1;
		int avg = 0;
		int avgInd = 0;
		int minSum = Integer.MAX_VALUE;
		int minAvg = Integer.MAX_VALUE;
		while (j < N) {
			int sum = 0;
			for (int x = i; x <= j; x++) {
				sum += A[x];
			}
			avg = sum / B;
			System.out.print(sum + "--" + avg);

			if (avg <= minAvg && sum < minSum) {
				minSum = sum;
				minAvg = avg;
				avgInd = i;
			}
			System.out.println("-" + avgInd);
			i++;
			j++;
		}
		return avgInd;
	}
}
