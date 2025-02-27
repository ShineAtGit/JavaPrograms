package collections;

import java.util.HashMap;

public class OccuranceOfCharacters {

	public static void main(String[] args) {

		String str = "shine amarakuni";

		char[] charStr = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (Character c : charStr) {

			// 1.********* Using If-else *******

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
			// 2.******** Using Tertiary Operator ****

			hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
		}

		System.out.println(hm);
	}

}
