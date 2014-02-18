package factory2;

import java.io.*;
import java.util.Properties;

public class Remote implements DataConnection {

	@Override
	public Properties getDetails() {
		
		          try {
		        	  
		        	  FileReader reader=new FileReader("config1.properties");
		        	  Properties properties = new Properties();
			    		properties.load(reader);
			    		return properties;
		      	  
		      	
			}catch(Exception e){
				
			}
			return null;}

	
}
