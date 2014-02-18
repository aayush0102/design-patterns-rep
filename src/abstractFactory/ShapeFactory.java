package abstractFactory;

public class ShapeFactory extends AbstractFactory{
	
	
	Color getColor(String color) {
		
		
		return null;
		
	}
	
	@Override
	Shape getShape(String shape) {
		
		if (shape.equalsIgnoreCase("circle")){
			return new Circle();
		}
		return null;
	}

}
