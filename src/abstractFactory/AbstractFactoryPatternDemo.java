package abstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]){
		FactoryProducer factoryproducer =new FactoryProducer();
		AbstractFactory abstractfactory= factoryproducer.getType("COLOR");
		Color color = abstractfactory.getColor("blue");
		color.fill();
		
		FactoryProducer factoryproducer1 =new FactoryProducer();
		AbstractFactory abstractfactory1= factoryproducer1.getType("SHAPE");
		Shape shape= abstractfactory1.getShape("circle");
		shape.draw();
		
	}
}
