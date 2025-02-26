package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>(Set.of("Apple", "Banana", "Cherry", "Dragon", "Eggfruit"));
		hs.add("Apple");

		// 1.Printing Basic operations

		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("Apple"));
		hs.remove("Apple");
		System.out.println(hs);

		// 2.How to iterate through Set using iterator() method;

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 3.Using iterator()method in Integer Set

		HashSet<Integer> num = new HashSet<>(Set.of(23, 45, 33, 226, 76));
		System.out.println(num);

		Iterator<Integer> numit = num.iterator();
		while (numit.hasNext()) {
			System.out.println(numit.next());
		}
	}
}
