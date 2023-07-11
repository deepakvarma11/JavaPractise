package exceptionHandlings;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Java8ExceptionOne {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		int key = 0;

		try {
			Perform(nums, key, (num, k) -> System.out.println(num / k));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic exception " + e.getLocalizedMessage());
		}

	}

	private static void Perform(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {

		for (int num : arr) {
			consumer.accept(num, key);
		}
	}
}
