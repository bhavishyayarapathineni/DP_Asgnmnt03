package que13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		 
        
        al.add("dog");
        al.add("cat");
        al.add("bat");
        al.add("rat");
 
        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("mat");
        v.addElement("hat");
       
 
        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
	}

}
