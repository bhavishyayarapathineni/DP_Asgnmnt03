package que19;
import java.io.*;
import java.util.*;
 
public class thr implements Runnable {
    public void run()
    {
        System.out.println("Bhavishya.Y");
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable r1 = (Runnable) new thr();
	        Thread t1 = new Thread(r1, "My Thread");
	        // Thread object started
	        t1.run();
	        // getting the Thread
	          // with String Method
	        String str = t1.getName();
	        System.out.println(str);
	    }
	
	}


