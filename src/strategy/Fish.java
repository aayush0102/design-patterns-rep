package strategy;

public abstract class Fish {
	
	EatingType type;
	
	
	public void eat(){
				
		type.eat();
		
	}
	
    public void display(){
    	System.out.println("I am a fish");
		
	}
	

}
