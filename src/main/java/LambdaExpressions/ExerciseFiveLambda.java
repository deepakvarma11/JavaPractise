package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import inheritance.Person;

public class ExerciseFiveLambda {

	public static void main(String[] args) {
		System.out.println("============Java8===============");

		List<PersonPOJO> people = Arrays.asList(new PersonPOJO("deepak", "varma", 25),
				new PersonPOJO("Manik", "sharan", 26), new PersonPOJO("Rohit", "Cholleti", 29),
				new PersonPOJO("Siddu", "Roy", 27));

		// 1 sort the People with Lastname
		Collections.sort(people, (PersonPOJO o1, PersonPOJO o2) -> {
			return o1.getLastName().compareTo(o2.getLastName());
		});

		// 2 Print the people
		System.out.println("Printing all the persons");
		performConditionally(people, p -> true, p -> System.out.println(p));

		// 3 Print the person whose name lastname starts with 'V'
		performConditionally(people, p -> p.getLastName().startsWith("v"), p -> System.out.println(p));

		// 4 Print the person whose name lastname starts with 'V'
		performConditionally(people, p -> p.getFirstName().startsWith("M"), p -> System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<PersonPOJO> people, Predicate<PersonPOJO> predicate,
			Consumer<PersonPOJO> consumer) {
		for (PersonPOJO p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
