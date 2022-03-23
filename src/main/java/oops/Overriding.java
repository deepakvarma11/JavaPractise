package oops;

class A {

	public void show() {
		System.out.println("in A");
	}
}

class B extends A {
	
	@Override
	public void show() {
		super.show();
		System.out.println("in B");
	}
}

public class Overriding {

	public static void main(String[] args) {
		A a1 = new A();
		a1.show();
//
		A a2 = new B();
		a2.show();

		B b1 = new B();
		b1.show();

	}
}
