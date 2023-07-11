package strings;

import static java.lang.System.*; // static import  // https://www.youtube.com/watch?v=kHWcA4X2anE

public class StringComparism {

	// https://www.youtube.com/watch?v=to9DPVsdByE

	public static void main(String[] args) {
		String a = "dog";
		String b = new String("dog");
		String c = "dog";

		if (a.hashCode() == b.hashCode()) {
			System.out.println("Equal hashcode");
		} else {
			System.out.println("Hashcode not equal");
		}

		if (a == b) { // compare objects reference
			out.println("true"); // We can call the static methods directly if static import is defined
		} else {
			System.out.println("False");
		}

		if (a.equals(b)) { // compare text
			System.out.println("true");
		} else {
			System.out.println("False");
		}

		if (a == c) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

		if (a.equals(c)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
		System.out.println("==============");
		Stringulitilies();
		

	}

	public static void Stringulitilies() {
		String str1 = "user";
		String str2 = "user";
		String str3 = str1;
		String str4 = new String("user");
		String str5 = new String("user");

		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println(str4 == str3);
		System.out.println(str4.equals(str3));
		System.out.println(str4.compareTo(str3));
		System.out.println(str4.compareTo(str5));
	}

	public static void subStrings() {
		String str = "varma";

		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(1, 1));
		System.out.println(str.substring(1, 2));
		System.out.println(str.substring(1, 3));
		System.out.println(str.substring(0, str.length() - 1));

	}

}
