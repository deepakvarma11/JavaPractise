package factorydesignPattern;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		return null;
	}
}
