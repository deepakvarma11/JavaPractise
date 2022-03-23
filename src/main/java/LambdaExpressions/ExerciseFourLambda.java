package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseFourLambda {
	
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
		printConditionally(people, p -> true);

		// 3 Print the person whose name lastname starts with 'V'
		printConditionally(people, p -> p.getLastName().startsWith("v"));

		// 4 Print the person whose name lastname starts with 'V'
		printConditionally(people, p -> p.getFirstName().startsWith("M"));
		
	}

	private static void printConditionally(List<PersonPOJO> people, Predicate<PersonPOJO> condition) {
		for (PersonPOJO p : people) {
			if (condition.test(p))
				System.out.println(p);
		}
	}
}
