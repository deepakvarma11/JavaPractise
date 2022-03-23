package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceOne {

	public void methodPrint(String s, String s2) {
		System.out.println(s);
	}

	public void methodPrint(String s) {
		System.out.println(s);
	}

	public static void methodPrintStatic(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Deepak", "varma", "ggfdaf");

		list.stream().forEach(new MethodReferenceOne()::methodPrint);

		list.forEach(MethodReferenceOne::methodPrintStatic);

	}
}
