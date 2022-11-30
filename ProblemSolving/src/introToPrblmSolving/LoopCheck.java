package introToPrblmSolving;

public class LoopCheck {
	public static void main(String[] args) {
		int j = 0;
		int count = 0;
		for(int i = 0; i <1000; i++) {
			count++;
			while(j<100) {
				System.out.println(j);
				j++;
			}
		}
		System.out.println(count);
	}
}
