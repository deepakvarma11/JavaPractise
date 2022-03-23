package practise;

public class Singleton {

	private static Singleton si = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (si == null) {
			si = new Singleton();
		}
		return si;
	}
}

class Test {

	public static void main(String[] args) {
//		Singleton s = new Singleton();
		
		Singleton s = Singleton.getInstance();
		
	}
}