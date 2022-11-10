package que21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ser1 {

	
		
			public static void printdata(seri object)
			    {
			  
			        System.out.println("name = " + object.name);
			        System.out.println("age = " + object.age);
			        System.out.println("a = " + object.a);
			        System.out.println("b = " + object.b);
			    }
			  
			public static void main(String[] args)
			    {
			        seri object = new seri("ab", 20, 2, 1000);
			        String filename = "shubham.txt";
			  
			       
			        try {
			  
			            // Saving of object in a file
			            FileOutputStream file = new FileOutputStream
			                                           (filename);
			            ObjectOutputStream out = new ObjectOutputStream
			                                           (file);
			  
			            // Method for serialization of object
			            out.writeObject(object);
			  
			            out.close();
			            file.close();
			  
			            System.out.println("Object has been serialized\n"
			                              + "Data before Deserialization.");
			            printdata(object);
			  
			            // value of static variable changed
			            object.b = 2000;
			        }
			  
			        catch (IOException ex) {
			            System.out.println("IOException is caught");
			        }
			  
			        object = null;
		}

	}

	}

}
