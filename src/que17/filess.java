package que17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class filess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        
  
        Iterator iterator = cityCode.keySet().iterator();
  
        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
  
            
            cityCode.put("Seoul", "S korea");
		
		
        }
	}
}


