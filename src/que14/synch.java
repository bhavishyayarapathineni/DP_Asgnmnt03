package que14;
import java.util.* ;
public class synch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> litt = new ArrayList<String>();
		 
        // Adding elements to above List
        // using add() method
        litt.add("north");
        litt.add("west");
        
 
       
        System.out.println(litt);
 
        
        Collections.synchronizedList(litt);
 
       
        synchronized (litt) {
 
            
            Iterator<String> itrobj = litt.iterator();
 
           
            while (itrobj.hasNext()) {
                
                System.out.println(itrobj.next());
            }
        }
	}
	
}

