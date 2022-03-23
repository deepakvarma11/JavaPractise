package toStringMethod;

public class DemoToString {
	
	// https://www.youtube.com/watch?v=aRxZ4jw5YPk

	public static void main(String[] args) {
		Student s1 = new Student(1, "deepak");
//		System.out.println(s1.id + " " + s1.name);
		System.out.println(s1);  // Whenever we print this it will print the package name and class name along with hashcode 
									// of object and to print the exact values we can modify the toString method to ourselves
									// this printing s1 indirectly it will call s1.toString();
	}
}

/*
 * All classes are extended from Object class 
 * where it will different methods
 * like toString method
 * If we see here below toString method is overrided means it overrides the method from parent class Object class
 */

class Student{
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
