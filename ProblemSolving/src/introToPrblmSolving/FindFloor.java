package introToPrblmSolving;

public class FindFloor {
	public static void main(String[] args) {
		System.out.println(floor(624)); //24
		System.out.println(floor(125)); //11
	}
	
	//returns int value
	//Total iteration = sqrt(n)
	public static int floor(int value) {
		for(int i= 1; i <= value; i++) {
			if(i*i > value) {
				return i-1;
			}
		}
		return 0;
	}
}
