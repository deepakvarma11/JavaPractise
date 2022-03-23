package LambdaExpressions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseProblemWithoutLambda {

	public static void main(String[] args) {

		List<PersonPOJO> people = Arrays.asList(new PersonPOJO("deepak", "varma", 25),
				new PersonPOJO("Manik", "sharan", 26), new PersonPOJO("Rohit", "Cholleti", 29),
				new PersonPOJO("Siddu", "Roy", 27));
		
		
		System.out.println("============Java7===============");

		// sort the People with Lastname
		Collections.sort(people, new Comparator<PersonPOJO>() {

			@Override
			public int compare(PersonPOJO o1, PersonPOJO o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// Print the people

		for (PersonPOJO p : people) {
			System.out.println(p);
		}

		// Print the person whose name lastname starts with 'V'

		for (PersonPOJO p : people) {
			if (p.getLastName().startsWith("s"))
				System.out.println(p);
		}
		
		System.out.println("============Java7===============");



	}

}
