package myproject;

public class Thread2 implements Runnable {
	 public void run() {
		for(int i=0;i<=10;i++) {
	
		System.out.println("i = " +i);
	}
}

public static void main(String args[]) {
	Thread1 t1 =  new Thread1();
	Thread obj1 = new Thread(t1);
	Thread2 t2 =  new Thread2();
	Thread obj2 = new Thread(t2);
	obj1.start();
	obj2.start();
}
}