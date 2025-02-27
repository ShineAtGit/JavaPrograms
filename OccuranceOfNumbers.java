package collections;

import java.util.HashMap;

public class OccuranceOfNumbers {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (Integer a : arr) {

			// 1.********* Using If-else *******

			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}

			// 2.******** Using Tertiary Operator ****

			hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
		}
		System.out.println(hm);
	}
}
