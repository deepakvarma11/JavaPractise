package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BookMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Books> books = new ArrayList<>();

		books.add(new Books(97, "Git Pocket Guide", "A Working Introduction", "Richard E. Silverman",
				"2020-06-04T08:48:39.000Z", "O'Reilly Media", 234,
				"This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp",
				"http://chimera.labs.oreilly.com/books/1230000000561/index.html"));

		books.add(new Books(98, "Learning JavaScript Design Patterns", "A JavaScript and jQuery Developer's Guide",
				"Addy Osmani", "2020-06-04T09:11:40.000Z", "O'Reilly Media", 254,
				"With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-da",
				"http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/"));

		List<Long> isb = books.stream().filter(p -> !(p.getIsbn() == 97)).map(p -> p.getIsbn())
				.collect(Collectors.toList());

		isb.forEach(i -> System.out.println(i));

	}

}
