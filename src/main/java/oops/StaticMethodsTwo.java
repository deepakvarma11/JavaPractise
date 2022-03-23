package oops;

class EmpTwo{
	
	int eid;
	int salary;
	static String ceo;
	
	static {
//		eid = 2;  // Throws error since it is not static
		ceo = "Nitesh";
	}
	
	/*
	 * Static blocks are usually used to assign values to static variables
	 * Static block will be called first whenever the class is loaded
	 * And only one time will get called, even if they are n no of object created
	 * And Static methods will have static variables only 
	 */
	
	public EmpTwo() {
		eid = 1;
		salary = 4000;
		ceo = "mahesh";
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	
}

public class StaticMethodsTwo {

	public static void main(String[] args) {
		
		EmpTwo e1 = new EmpTwo();
		e1.show();
	}
}
