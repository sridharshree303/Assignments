package t3_Arrays_InterviewPrblms2;

public class MajorityElement {
	public static void main(String[] args) {
		int[] an = {2,1, 2,2,3,2,1,1,1,1};
		int[] as = { 2,1,1,2};
		int[] ass = { 3,2,1,1,1};
		System.out.println(majorityElement(as));
		System.out.println(majorityElement(ass));

	}

	//Boyer–Moore majority vote algorithm
	//TC = O(n)
	//SC = O(1)
	public static int majorityElement(final int[] A) {
		int maj = -1;
        int count = 0;
        //loop the indexes
        for(int i=0;i<A.length;i++){
            if(count == 0 ){
            	maj = A[i];
                count = 1;
            }else if(maj == A[i]){
            	count++;
            }else {
                count--;
            }
        }
        return maj;
    }
}
