package factory2;

public class ConnectionFactory {
	
	DataConnection getMethod(String location){
		
		if(location.equalsIgnoreCase(null))
			return null;
		else if(location.equalsIgnoreCase("local")){
			return new Local();
		}else if (location.equalsIgnoreCase("remote")){
			return new Remote();
		}
		return null;		
		}
		
	}
