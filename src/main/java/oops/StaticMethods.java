package oops;

class Emp {

	int eid;
	int salary;
	static String ceo;

	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}

}

public class StaticMethods {

	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.eid = 1; // Objects variables are stored in Heap memory
		e1.salary = 1000;
		e1.ceo = "Mahesh"; // Class variables will be stored in Class loader

		Emp e2 = new Emp();
		e2.eid = 2;
		e2.salary = 2000; // Non- static variables are different for different objects
		Emp.ceo = "Nitesh";

		/*
		 * static variables will be same for every class, So once it changed, it will get
		 * changed for other objects as well
		 * Static variables can also be called by Obects or with Class name directly
		 */

		e1.show();
		e2.show();

	}

}
