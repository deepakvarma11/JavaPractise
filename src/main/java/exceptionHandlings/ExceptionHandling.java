package exceptionHandlings;

public class ExceptionHandling {

	int a = 10;

	public static void main(String[] args) {

		// uncaught expection
//		int k= 9/0;
//		System.out.println(k);

		// caught exception
//		Thread.sleep(2000);

//		ExceptionHandling eh = new ExceptionHandling();
//		eh = null;
//		System.out.println(eh.a);
//		

		// 1. Try catch
		try {
			int j = 8 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey its an error");
		}

	}

}
