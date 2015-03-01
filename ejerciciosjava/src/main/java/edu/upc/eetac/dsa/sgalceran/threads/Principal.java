package edu.upc.eetac.dsa.sgalceran.threads;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException{
	
		runnable r = new runnable();
        thread1 thread = new thread1();
        r.run();
        thread.start();
        //r.join();
        thread.join();	
	}
	
	}


