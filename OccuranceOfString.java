package collections;

import java.util.HashMap;

public class OccuranceOfString {

	public static void main(String[] args) {

		String str = "shine shyam shine thing kerala pulpally kerala house shyam shine shyam";

		String[] strArray = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String a : strArray) {

			hm.put(a, hm.containsKey(a) ? hm.get(a) + 1 : 1);
		}

		System.out.println(hm);
	}

}
