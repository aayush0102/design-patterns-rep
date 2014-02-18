package factory;

public class FactoryPatternDemo {

	
	public static void main(String[] args) {
		
		ShapeFactory obj =new ShapeFactory();
		Shape shape1= obj.getShape("circle");
		shape1.draw();

		
		
		Shape shape2= obj.getShape("rectangle");
		shape2.draw();
	}

}
