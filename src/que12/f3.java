package que12;

public class f3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3 m = new f3();
		 
        // Calling finalize method Explicitly.
        m.finalize();
        m.finalize();
        m = null;
 
        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }
 
    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }

	}


