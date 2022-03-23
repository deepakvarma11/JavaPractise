package singletonDesignPatt;

public class singletonDesignPattern {

	public static void main(String[] args) {
		
		Square s = Square.getInstance();
		System.out.println(s.getValue());
		
		Square s2 = Square.getInstance();
		s2.setValue("test1");
		
		System.out.println(s.getValue());
		
		Square s3 = Square.getInstance();
		System.out.println(s3.getValue());
		
	}
}
