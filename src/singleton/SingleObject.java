package singleton;

public class SingleObject {
	
/* This pattern involves a single class which is responsible to creates own object while making sure that only 
 * single object get created.  
 * This class provides a way to access its only object which can be accessed directly without need to instantiate
 * the object of the class.
 * 
 */
	
	
	/* constructor is private hence cannot be instantiated from outside */
	private SingleObject(){
		}
		
	/* static methods can only call static variables 
	 * 
	 */
	private static SingleObject instance ;
	public static int count; 
	
	/* as the object cannot be created from outside the class, we would need a static method that returns the object which could be 
	 * called without creating the object
	 */
	 
	public static SingleObject getInstance(){
		
		/* this ensures that an object gets created only when there none exist
		 * 
		 */
		
		if(instance == null)
		{
     		instance=new SingleObject();
     				                    
		}
	return instance;
	    }
	
	public void getMessage()
	    {
		count++;
		System.out.print(count);
		}

}
