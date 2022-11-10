package que22;

import java.util.HashMap;
import java.util.Map;

public class immutable {

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub
		 private final String name;
		    private final int regNo;
		    private final Map<String, String> metadata;
		 
		    
		    public immutable(String name, int regNo,
		                   Map<String, String> metadata)
		    {
		 
		        
		        this.name = name;
		        this.regNo = regNo;
		 
		        
		        Map<String, String> tempMap = new HashMap<>();
		 
		        
		        for (Map.Entry<String, String> entry :
		             metadata.entrySet()) {
		            tempMap.put(entry.getKey(), entry.getValue());
		        }
		 
		        this.metadata = tempMap;
		    }
		 
		   
		    public String getName() { return name; }
		 
		   
		    public int getRegNo() { return regNo; }
		   
		    public Map<String, String> getMetadata()
		    {
		 
		       
		        Map<String, String> tempMap = new HashMap<>();
		 
		        for (Map.Entry<String, String> entry :
		             this.metadata.entrySet()) {
		            tempMap.put(entry.getKey(), entry.getValue());
		        }
		        return tempMap;
		    }
		


}
