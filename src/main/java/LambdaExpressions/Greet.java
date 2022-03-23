package LambdaExpressions;

interface Greeting {

	public void perform();
}

public class Greet {

	public static void main(String[] args) {
		Greeting la = () -> System.out.println("Hello Bye bye!!");
		la.perform();

		Greeting gt = new Greeting() {

			public void perform() {
				System.out.println("Hello innerclass");
			}

		};
		gt.perform();
	}

}
