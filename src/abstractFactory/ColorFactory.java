package abstractFactory;

public class ColorFactory extends AbstractFactory{
	
Color getColor(String color) {
		
		if (color.equalsIgnoreCase("blue"))
			return new Blue();
		
		
		return null;
			}

Shape getShape(String shape) {
	
	return null;
}
	

}
