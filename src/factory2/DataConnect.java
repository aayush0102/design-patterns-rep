package factory2;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

// this is a complete working example without any design patters being used.

public class DataConnect {
	

	    public static void main(String[] args) {
	          
	    
	          try {
	        	  
	        	 FileReader reader=new FileReader("config.properties");
	        	  Properties properties = new Properties();
		    		properties.load(reader);
		    		String url= properties.getProperty("url");
		    		String dbName=properties.getProperty("dbName");
		    		String driver=properties.getProperty("driver");
		    		String userName=properties.getProperty("userName");
		    		String password=properties.getProperty("password");
	        	  
	        	
	        	  
	          Class.forName(driver).newInstance();
	          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
	        	  
	          Statement st = conn.createStatement();
	          int val = st.executeUpdate("INSERT into userprofile(name,college,email,phone,address) VALUES('aayush','xyz','aayush@sri',98765432,'gzb')");
	          if(val==1)
	          System.out.print("Successfully inserted value");
	               	         
	          conn.close();
	          } catch (Exception e) {
	          e.printStackTrace();
	          }


	
	          
	          }}
	          
	


