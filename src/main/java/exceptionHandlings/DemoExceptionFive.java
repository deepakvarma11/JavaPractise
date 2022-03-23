package exceptionHandlings;

public class DemoExceptionFive {

	public static void main(String[] args) {
		int i = 7;

		try {
			if (i < 10) {
				throw new MyException("No is less than 10");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}