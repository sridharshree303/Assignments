package introToPrblmSolving;

public class NNaturalNums {
	public static void main(String[] args) {
		System.out.println(sum(100)); // 5050
		System.out.println(sum(50)); // 1275
	}

	public static int sum(int A) {
		return (A * (A + 1) / 2);
	}
}

//---------- Size of N-------------
// 1, 2, 3 ,....50
// 50,49,48,.....1

// ---------- then apply the logic -----------
// 51+51+51......+51
// 51*50/2 = 1275


