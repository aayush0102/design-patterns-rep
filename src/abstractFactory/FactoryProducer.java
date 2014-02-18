package abstractFactory;

public class FactoryProducer {
	
	AbstractFactory getType(String type){
		if (type.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		
		else if (type.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		} 
		return null;
	}

}
