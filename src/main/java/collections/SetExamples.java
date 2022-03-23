package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class SetExamples {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("one");
		set.add("two");
		set.add("three");

		Stream<String> stream = set.stream();

		stream.forEach((element) -> {
			System.out.println(element);
		});

		// Convert Set to List

		Set<String> set1 = new HashSet<>();
		set.add("123");
		set.add("456");

		List<String> list = new ArrayList<>();
		list.addAll(set1);

		System.out.println("-----------maps-------------");

		Map<String, String> map = new HashMap<>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");

		Stream<String> stream1 = map.keySet().stream();
//		stream1.forEach((keys) -> {
//		    System.out.println(keys);
//		});

		stream1.forEach((keys) -> {
			System.out.println(map.get(keys));
		});
	}

}
