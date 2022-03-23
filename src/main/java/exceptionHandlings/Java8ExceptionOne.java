package exceptionHandlings;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Java8ExceptionOne {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		int key = 0;

		Perform(nums, key, (value, k) -> System.out.println(value / k));

	}

	private static void Perform(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : arr) {
			consumer.accept(i, key);
		}
	}
}
