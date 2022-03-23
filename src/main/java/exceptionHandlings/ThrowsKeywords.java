package exceptionHandlings;

public class ThrowsKeywords {

	public static void main(String[] args) {
		ThrowsKeywords t = new ThrowsKeywords();
		try {
			t.sum();
		} catch (ArithmeticException e) {

		}
		System.out.println("ABC"); // Not getting executed
	}

	public void sum() { // Ultimately we have to use try catch somewhere to handle this
		div1();
	}

//	public void div1() {
//		try {
//			int k = 9 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//	}

	public void div1() throws ArithmeticException {
		int k = 9 / 0;
	}
}
