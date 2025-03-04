package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class NthHighestSalary {
	//write a program to find nth highest salary in the given array.
	//if we want to find the second highest salary, pass n=2, then you should get 78999.
	public static void main(String[] args) {

		int[] numbers = { 12340, 43214, 65436, 98749, 23443, 54443, 78999 };

		NthHighest(numbers, 2);
	}

	private static void NthHighest(int[] numbers, int n) {
		Optional<Integer> r = Arrays.stream(numbers).boxed().distinct().sorted(Comparator.reverseOrder()).skip(n - 1)
				.findFirst();
		System.out.println(r.get());
	}
}
