package factory2;

import java.util.Properties;
import java.io.*;


public class Local implements DataConnection {

	@Override
	public Properties getDetails() {
		// TODO Auto-generated method stub
		
		
	          try {
	        	  
	        	  FileReader reader=new FileReader("config.properties");
	        	  Properties properties = new Properties();
		    		properties.load(reader);
		    		return properties;
	      	  
	      	
		}catch(Exception e){
			
		}
		return null;}

	
	/* public Connection loadDriver(Properties properties) {
		// TODO Auto-generated method stub
		
		Properties properties1= getDetails("local");
		String url= properties1.getProperty("url");
		String dbName=properties1.getProperty("dbName");
		String driver=properties1.getProperty("driver");
		String userName=properties1.getProperty("userName");
		String password=properties1.getProperty("password");
		
		try{
		Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url+dbName,userName,password);
        return conn;}
		catch(Exception e){
			
		}
        return null;
	} */

}
