//package assign;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Second {
//	public static void main(String[] args) {
//		List<Integer> li = Arrays.asList(-100000,);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.addAll(li);
//		System.out.println(maxp3(list));
//	}
//
//	public static int maxp3(ArrayList<Integer> A) {
//		for(int i=0;i<A.size();i++){
//			int temp = A.get(i);
//            if(temp < 0) {
//            	A.set(i, Math.abs(temp));
//            }
//        }
//		Collections.sort(A,Collections.reverseOrder());
//		System.out.println(A);
//		int max = 1;
//		for(int i=0;i<A.size();i++) {
//			if(i < 3) {
//				max *= A.get(i);
//				continue;
//			}
//			break;
//		}
//		return max;
//	}
//}
