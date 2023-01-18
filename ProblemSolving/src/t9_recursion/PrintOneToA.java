package t9_recursion;

public class PrintOneToA {
	public static void main(String[] args) {
		printVals(10);
		System.out.println();
		printValsAsc(10);
	}

	// A to 1
	public static void printVals(int A) {

		if (A == 0) {
			return;
		}
		System.out.print(A + " ");
		printVals(A - 1);
		
		//if (A == 0) {
        //  System.out.println();
		//	return;
		//}
		//System.out.print(A + " ");
		//printVals(A - 1);

	}

	//1 to A
	public static void printValsAsc(int A) {
		if(A ==0) {
			return;
		}
		printValsAsc(A-1);
		System.out.print(A+" ");
	}
	
	/*
	public void solve(int A) {
        printNums(A);
        System.out.println("");
    }
    public void printNums(int A){
        if(A == 1){
            System.out.print(1 + " ");
            return;
        }
        printNums(A-1);
        System.out.print(A + " ");
    }
    */
}
