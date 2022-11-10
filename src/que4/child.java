package que4;

	public class child extends parent {
		   protected void display() { // trying to override display() {
		      System.out.println("Sub class");
		   }
		   public static void main(String[] args) {
		      parent obj = new child();
		      obj.display();
		   }
		

	
	}


