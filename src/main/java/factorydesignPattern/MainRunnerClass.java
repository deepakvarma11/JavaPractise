package factorydesignPattern;

public class MainRunnerClass {

	public static void main(String[] args) {

		Shape s1 = ShapeFactory.getShape("SQUARE");
		s1.draw();
		
		Shape s2 = ShapeFactory.getShape("RECTANGLE");
		s2.draw();
	}

}
