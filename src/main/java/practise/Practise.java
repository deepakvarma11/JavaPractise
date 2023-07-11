package practise;

public class Practise {

	public static void main(String[] args) {
		arrayTarget();

		System.out.println("afhsdfj%^%^E^%#@656!&@&1243q4".replaceAll("[^a-zA-z]+", ""));
	}

	public static void arrayTarget() {
		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int targ = 20;

		for (int i = 0; i < arr.length; i++) {
			int one = arr[i];
			for (int k = i + 1; k < arr.length; k++) {
				int two = arr[k];

				if ((one + two) == targ) {
					System.out.println(one + "," + two);
				}

			}
		}
	}
}
