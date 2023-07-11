package strings;

public class Builders {

	// https://www.youtube.com/watch?v=oYcb0N1YfVw

	/*
	 * Strings are immutable, once a string is created it will not be deleted from
	 * heap memory We use string buffer and string builder for String mutability
	 * 
	 * String buffer is thread safe means synchronized and string builders are not
	 * thread safe Whenever applicatioin is running on Multiple threads then go for
	 * string buffer if not then use builder
	 * 
	 * Both will have same methods
	 */

	public static void main(String[] args) {

		StringBuffer bf = new StringBuffer("Deepak");
		bf.append(" varma");
//		bf.reverse();

		System.out.println(bf);

		System.out.println(System.getProperty("os.name"));
	}

}
