package myproject;

public class Thread1 extends Thread{
 public void run() {
	 for (int i=0;i<=10;i++) {
		System.out.println(" i = " +i);
  } 
 }


public static void main (String args[]) {
	Thread1 t1 = new Thread1();
	t1.start();
	Thread1 t2 = new Thread1();
	t2.start();
}
}