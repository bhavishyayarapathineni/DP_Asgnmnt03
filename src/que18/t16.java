package que18;

public class t16 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			public void run(){
				System.out.println("thread started.");
			}
		}
		 
		
				//creating thread.
				t16 thrd = new t16();
		 
				//start the thread.
				thrd.start();
		 
				//again start the thread which is already started.
				//IllegalThreadStateException here.
				thrd.start();
			}
	}

}
