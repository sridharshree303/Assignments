package t3_Arrays_2PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquilibriumIndexPrb1 {
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(-7653, -3893, 2371, 4846, 5531, 7995, -9637, 2740, -5807, -5974, -8040, -5191, 2756, 7044, 1702, 2357, 6428, -3363, -7233, 356, 1161, -6762, 3844, -2591, 1683, -1529, -1485, 5264, 5837, 6942, -2790, 362, -3670, 8013, -882, 1014, 869, -4855, -5179, 2357, -8530, 3458, -3298, 9639, 9387, -3568, -4375, -2076, 6962, 1023, 6093, 7771, -4167, 5472, 710, -1886, -7533, 5588, 1830, -7054, -8271, 7956, 9231, -8723, 133, 5288, -7930, 6596, 9084, 3889, -1322, -9644, -1845, -6600, -3502, -1679, -524, -2646, -7516, 7477, 3345, -9345, 6552, -9659, -8228, 8736, -3801, 2717, -5218, 33, -9392, -737, -343, -5206, -5151, -192, 9857, -7362, 6713, 7524, 1892, 2156, -4224, 8030, -5094, 959, 9250, -4588, -4368, 3531, 5868, -9777, 7064, -5718, 6412, -189, -4323, -5987, 8161, 2709, 7433, 9648, -185, 270, -1299, -1976, -4157, -4372, -7090, -633, -9468, -8274, 9549, -6744, 2385, 8156, 5688, -792, -3338, 2283, 6503, -9786, 3878, 9541, -6152, 3785, 9396, -9695, -6004, 3621, -645, -3609, 2176, 6398, 1248, 2320, -4962, 5011, -8832, 6127, -7635, -6142, -4646, 3047, -2509, -4769, 4140, 5508, 9420, 8120, -2694, 6560, 8398, -100, 5759, 2696, 5696, 7748, -9611, 1007, -5228, 8574, 4507, -1011, 2723, -9726, 179, -2428, 9181, 4898, -8915, 7768, -5208, 8306, -2659, 3844, -661, 8452, 6041, 1380, 7817, 8973, 6751, -4815, 5347, -2711, 188, -5371, -679, -8278, 1903, -5038, -5791, -7893, 6515, -4994, 4527, -2608, -1213, 6028, 8742, -4275, -4817, -6160, 6422, -1766, -8639, 6205, -3150, 4615, 7417, 8710, -6074, -344, 4148, 1425, -632, -9160, 3297, -7114, 5159, 1386, 9770, 2347, -3587, -3875, -2635, 5048, -5901, -7484, 8975, -4308, 161, 299, -4049, -8815, -7762, 7018, -7943, 237, -6695, 7629, -7953, 9459, 4735, -3829, 9727, -6403, 5466, 6218, -5877, 2033, -4857, 1585, 514, -6989, 5236, -9830, -5191, 5947, 2560, -4052, -8077, -1288, 492, -4326, -492, 2294, -4923, -5192, 5162, 3137, 5975, 7399, -5645, 4187, -8523, 3651, -2419, 7813, 6036, -7307, 8254, 7936, -9467, 5581, -3412, 7572, 5229, 101, 1171, 8309, -6208, -8279, 444, -2281, -2046, -8015, 9570, -7134, 4339, 5946, 3592, -3576, -886, -4246, -610, 8529, 114, 6778, -7997, 7117, 7970, -9467, 1722, -1286, 3767, -930, 7682, -3814, -4258, -3810, -8109, -9843, 8266, -732, 6784, -8437, 2357, -4750, -7906, -9440, -4353, -7544, 8803, 5253, 5256, -5497, 8886, 4304, 8080, 908, 6009, 4940, -9357, 3402, -1661, -1435, 5537, -7720, 5460, -872, -1353, -5385, 9094, -4783, 9087, -8572, -1667, 1788, -7608, 2228, 6087, 2984, 7494, -7699, -2480, -3224, -7232, 4543, -6029, -2972, 9430, 8164, 1959, -2684, -2414, -8991, -3467, -4217, -1649, 837, 4336, -2265, -3976, 9518, -734, 4976, 3196, 8596, -6076, -1447, -4851, 4907, -478, -7859, -5003, 8428, -9053, 4681, -795, 3330, 5359, -5970, -220, -7393, 1088, -1559, -9193, 7574, 6186, -9753, -9647, 7090, 443, -4809, 3298, 6116, 2494, 7231, 3493, -6231, -6764, -6311, 5140, 5977, 4169, 5221, 4568, -1875, 7542, 9705, 2771, -718, 3135, 5548, -1085, 3003, -3784, -2730, -6471, 9204, 9575, -8391, -3986, 1410, -5961, 4005, -6029, -6209, 8290, 2692, 3424, 5242, -8314, 4330, -2775, 4755, 8850, 2378, 8147, 5597, 8121, -5413, 7104, 9328, 5535, 0, 9065, -4788, -1505, 2202, -8444, 5989, 7361, 9707, -7802, 3466, -8042, 2077, -8845, -66, -7741, 5097, -268, -4540, -3439, -9265, -2806, 6926, 4592, 3148, -7634, 2777, -9401, -6748, -9755, 7814, -7294, -2509, -820, 338, 7721, 4314, 5798, 5146, -9934, -1057, 8088, 4854, 9482, 719, 7099, -5376, -2543, 587, 2026, -5367, -4480, 2011, -3743, 5779, -9267, -7509, 8485, -666, 1450, -4380, -1108, -2459, -7715, -3057, -1689, 436, 2696, -6039, -1375, -9400, 4052, 5780, 2796, -4295, 3960, 855, 548, -5908, -5673, -8366, 7366, -3138, -3512, 9567, -7559, 9387, -7031, 9293, -4569, -2683, -1176, 7786, -3516, -2594, 4886, 4669, 2079, -6810, -1645, -1342, 3529, 2070, -6946, 6439, 952, -1495, -4243, 8994, -6882 );
		ArrayList<Integer> arr = new ArrayList<>();
		List <Integer> list1 = Arrays.asList(1, 2, 3, 7, 1, 2, 3);
		arr.addAll(list1);
		
		
		
		System.out.println(solve(arr));
	}

	public static int solve(ArrayList<Integer> A) {
		int n = A.size();
		for(int i =1;i<n;i++) {
			A.set(i, A.get(i-1)+A.get(i));
		}
		for(int i=0;i<n;i++) {
			int left;
			int right;
			if(i == 0) {
				left = 0;
			}else {
				left = A.get(i-1);
			}
			right = ((A.get(n-1))-A.get(i));
			
			if(left == right) {
				return i;
			}
		}
		return -1;
	}

}