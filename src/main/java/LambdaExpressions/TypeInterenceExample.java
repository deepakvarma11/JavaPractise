package LambdaExpressions;

public class TypeInterenceExample {

	public static void main(String[] args) {
		StringLengthLambda st = (s) -> s.length();
		System.out.println(st.stringLength("Hello!!!!"));
	}
}

interface StringLengthLambda {

	int stringLength(String s);

}
