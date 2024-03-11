package myproject;

 class OR {
 public void displayInfo() {
	 System.out.println("This is Over Riding method");
 }
}

 class Method extends OverRiding {
	 public void displayinfo() {
		 System.out.println("This is extending the Method");
	 }
 }
 
 public class OverRiding {
	 public static void main(String args[]) {
		Method M = new Method();
		M.displayinfo();
		OR O = new OR();
		O.displayInfo();
	 }
 }