package ThreadExp;

public class echoer {
	public static void main(String[] args){
		System.out.println("-- Program started --");
		MyThread myThread = new MyThread(){
	    public void run(){
	        System.out.println(">myThread running"); 
	      }
		};
		
		Runnable myXoxo = new Runnable(){
			public void run(){
				System.out.println(">myXoxo running");
			}
		};
		
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		myThread.start();
		
		Thread thread2 = new Thread(myXoxo);
		thread2.start();
		System.out.println("-- Program ended --");

	}

}
