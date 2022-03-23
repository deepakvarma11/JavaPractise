package comparatorCamparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerClass {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();

		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 4, 400));

		// Based on Ram
		Collections.sort(laps);

		laps.stream().forEach((l) -> System.out.println(l));

		System.out.println("===================================");

		// based price value
		Collections.sort(laps, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

		});

		laps.forEach(System.out::println);

		System.out.println("=========================================");
		// same reverse order
		Collections.sort(laps, (o1, o2) -> {
			if (o1.getPrice() < o2.getPrice()) {
				return 1;
			} else {
				return -1;
			}
		});

		laps.forEach(l -> System.out.println(l));

		System.out.println("=========================================");

	}

}
