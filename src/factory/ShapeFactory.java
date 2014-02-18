package factory;

public class ShapeFactory {
	
	Shape getShape(String shapeName){
		
		if (shapeName.equalsIgnoreCase(null)){  
		return null; }
		else if(shapeName.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if(shapeName.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		} 
		return null;
		
	}
}

/* benefits
 * 1) concrete class implementation remains hidden
 * 2) family of objects have a shared interface
 * 3) one of the most used design patterns in java that provides one of the best way to create an object
 * 
 */
