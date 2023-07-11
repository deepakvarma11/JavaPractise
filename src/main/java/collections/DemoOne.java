package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoOne {

	/*
	 * https://www.javatpoint.com/collections-in-java
	 * 
	 */

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();

		s.add("Deepak");
		s.add("varma");
		s.add("Battini");
		s.add("uma");

		for (String daa : s) {
			System.out.println(daa);
		}

		System.out.println("-------We can collection interface--------");

		Collection<String> l = new ArrayList<>(); // http://tutorials.jenkov.com/java-collections/generic-collections.html

		l.add("Deepak");
		l.add("varma");
		l.add("Battini");
		l.add("uma");

		for (String daa : l) {
			System.out.println(daa);
		}

		System.out.println("--------------AddAll-----------");

		Collections.addAll(l, "element 1", "element 2", "element 3"); // http://tutorials.jenkov.com/java-collections/collections.html

		for (String daa : l) {
			System.out.println(daa);
		}

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		System.out.println("-------Before sorting-------");
//		for (String daa : list) {
//			System.out.println(daa);
//		}
		
		list.forEach(lis -> System.out.println(lis));
		
		Collections.sort(list);

		System.out.println("-------After sorting-------");
//		for (String daa : list) {
//			System.out.println(daa);
//		}
		
		list.stream().forEach(lis -> System.out.println(lis));

		int index = Collections.binarySearch(list, "four");

		System.out.println(index);

		Collections.shuffle(list);

		System.out.println("-------After shuffling-------");
		for (String daa : list) {
			System.out.println(daa);
		}

	}

}
