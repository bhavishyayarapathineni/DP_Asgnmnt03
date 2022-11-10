package que15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		   ht.put(1," KoteswaraRao");
	        ht.put(2,"Purnima");
	        ht.put(3,"Sai Tejaswini");
	        ht.put(4, "Bhavishya");
	        ht.put(23,"Yarapathineni");
	        System.out.println(" ");
	        for (Map.Entry m:ht.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	 
	        
	        HashMap<Integer,String> hm=new HashMap<Integer,String>();
	        hm.put(10,"Apple");
	        hm.put(20,"Banana"); 
	        hm.put(30,"Cake");
	        hm.put(40,"Doll");
	        System.out.println("-----------Hash map-----------");
	        for (Map.Entry m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	


