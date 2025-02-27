package collections;

import java.util.ArrayList;
import java.util.List;

public class CommonStrings {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>(List.of("shine", "shyam", "anshu"));
		ArrayList<String> al2 = new ArrayList<>(List.of("shine", "sivan", "sheela", "anshu"));

		// 1.*****Using loops****

		usingLoop(al1, al2);

		// 2.****Using Streams****

		usingStreams(al1, al2);

		// 3.***RetainAll function

		usingRetainAll(al1, al2);
	}

	private static void usingRetainAll(ArrayList<String> al1, ArrayList<String> al2) {
		ArrayList<String> alRetain = new ArrayList<>(al1);
		alRetain.retainAll(al2);
		System.out.println(alRetain);
	}

	private static void usingLoop(ArrayList<String> al1, ArrayList<String> al2) {
		ArrayList<String> alLoop = new ArrayList<>();

		for (String a : al1) {
			if (al2.contains(a)) {
				alLoop.add(a);
			}
		}
		System.out.println(alLoop);
	}

	private static void usingStreams(ArrayList<String> al1, ArrayList<String> al2) {
		List<String> alStreams = al1.stream().filter(al2::contains).toList();
		System.out.println(alStreams);
	}

}
