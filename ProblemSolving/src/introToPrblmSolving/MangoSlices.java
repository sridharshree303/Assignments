package introToPrblmSolving;

// one mango can slices into 3 pieces and with two slices can make an 1 juice
// then A no of mangos and B no of slices
public class MangoSlices {
	public static void main(String[] args) {
		System.out.println(solve(10,3));
	}
	
	public static int solve(int A, int B) {
		int nSlices = B+A*3;
		return nSlices/2; //returns no of juices
	}
}
