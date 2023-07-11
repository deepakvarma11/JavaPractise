package oops;

enum Mobile {

	APPLE(100), SAMSUNG, HTC(90);

	int price;

	public int getPrice() {
		return price;
	}

	Mobile(int p) { // Parameterized constructor
		price = p;
	}

	Mobile() {
		price = 80;
	}

	/*
	 * enums are like constants which value will never changes, Like Pie = 3.14 we
	 * can also define price variables and methods inside enums
	 */
}

//class Mobile {
//
//	static final Mobile APPLE = new Mobile();
//	static final Mobile SAMSUNG = new Mobile();
//	static final Mobile HTC = new Mobile();

/*
 * Above enum and this class behaves same way
 */
//}

public class Enumss {

//	enum Fruits {
//
//		APPLES, MANGOS, GRAPES
//
//		/*
//		 * enums can be defined inside a class or outside class and cannot be inside a method
//		 */
//	}

	public static void main(String[] args) {
		System.out.println(Mobile.APPLE);

		// We can set price for each mobile as well
		System.out.println(Mobile.SAMSUNG.getPrice());
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.HTC.getPrice());

		// We can also check the order by Ordinals
		System.out.println(Mobile.APPLE.ordinal());

		// We can also print all the enums in order wise
		Mobile mobile[] = Mobile.values();

		for (Mobile mm : mobile) {
			System.out.println(mm);
		}

		// We can use enums in Switch
		Mobile m = Mobile.SAMSUNG;

		switch (m) {
		case APPLE:
			System.out.println("Its an Apple");
			break;

		case SAMSUNG:
			System.out.println("Its an Samsung");
			break;
		}
	}
}
