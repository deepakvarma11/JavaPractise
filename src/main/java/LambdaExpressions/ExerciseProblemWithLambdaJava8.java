package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseProblemWithLambdaJava8 {

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
		Stream<PersonPOJO> st = people.stream();
		st.forEach((p) -> System.out.println(p));

		// 3 Print the person whose name lastname starts with 'V'

		Stream<PersonPOJO> st2 = people.stream();
//		st2.forEach((p) -> {
//			if (p.getLastName().startsWith("v"))
//				System.out.println(p);
//		});

		st2.filter(p -> p.getLastName().startsWith("v")).forEach(System.out::println);

	}

}
