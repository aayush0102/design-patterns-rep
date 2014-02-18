package strategy;

public class ExecStrategy {

	/*
	 * Design Issue - the eat() behaviour defined in Fish class should give following output as per the type of fish:
	 * "I am a plant eating fish"
	 * "I am a flesh eating fish"
	 * 
	 * One way is to override this method, but this is not a good idea ,if the number of fishes are more.
	 * Another way to deal with this is using the strategy design pattern.
	 * 1) encapsulate the behavior thats changing i.e. eat()
	 * 2) create an Interface with that behavior
	 * 3) Create classes with changing behavior type implementing eat() method.
	 * 4) creating a reference to the interface in Fish clas
	 * 5) Create a method eat() in Fish class which calls eat method from the above created classes using interface refernce
	 * 6) Implement constructor in sub classes of Fish setting the interface reference as plant eating or flesh eating.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CatFish cat=new CatFish();
		cat.display();
		cat.eat();
		
		DogFish dog=new DogFish();
		dog.display();
		dog.eat();
		
		GoldFish gold=new GoldFish();
		gold.display();
		gold.eat();

	}

}

