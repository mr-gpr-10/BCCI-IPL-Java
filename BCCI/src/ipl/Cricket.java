//This file have
//Thread creation using Runnable or extending Threads.
//Thread synchronisation.
package ipl;

class PrintDemo {
	   public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println(" We can watch IPL in Hotstar...!!! "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("IPL is One of the richest league of the world \n Thread  interrupted.");
	      }
	   }
	}

	class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemo( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
	      synchronized(PD) {
	         PD.printCount();
	         
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("IPL is Starting very soon...!!\t" +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	public class Cricket {

	   public static void main(String args[]) {
	      PrintDemo PD = new PrintDemo();

	      ThreadDemo T1 = new ThreadDemo( "IPL is comming soon\tThread-1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( " Ranaji is coming soon\tThread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}


