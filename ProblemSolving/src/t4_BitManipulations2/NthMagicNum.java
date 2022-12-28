package t4_BitManipulations2;

public class NthMagicNum {
	public static void main(String[] args) {
		System.out.println(solve(10));
	}
	//TC = O(log n)
	//SC = O(1)
	public static int solve(int A) {
		int ans=0;
        int i=1;
        while(A>0)
        {
            if((A&1)==1)
            {
                ans=ans+(int)(Math.pow(5,i));
            }
            i++;
            A=A>>1;
        }
        return ans;
        //1-> 0001 -> 5(1) = 5
        //2-> 0010 -> 5(2) = 10
        //3-> 0011 -> 5(2)+5(1) = 30
        //4-> 0100 -> 5(3) = 125
        //5-> 0101 -> 5(3)+5 = 130
        //6-> 0110 -> 5(3)+5(2) = 150
        //7-> 0111 -> 5(3)+5(2)+5 = 155
        //8-> 1000 -> 5(4) = 625
        //9-> 1001 -> 5(4)+5 = 630
        //10->1010 -> 5(4)+5(2) = 650
        //11->1011 -> 655
	}
}
