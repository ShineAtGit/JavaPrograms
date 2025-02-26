package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {

	public static void main(String[] args) {

		// 1. ****Adding elements one-by-one*****

		ArrayList<String> arList = new ArrayList<>();
		arList.add("Shine");
		arList.add("Syamily");
		arList.add("Anshu");
		System.out.println(arList);

		// 2.******Adding elements while declaring

		ArrayList<String> arList2 = new ArrayList<>(Arrays.asList("Sivan", "Sheela", "Sarojini"));
		System.out.println(arList2);

		System.out.println(arList2.get(2));// 3.*******Getting the value at specific index****

		arList2.add(0, "Shine");// 4.******Adding the new element at specific index****
		System.out.println(arList2);

		boolean flag = arList2.contains("Shine");// 5.****Check whether the element is present in the arraylist
		System.out.println(flag);

	}
}
