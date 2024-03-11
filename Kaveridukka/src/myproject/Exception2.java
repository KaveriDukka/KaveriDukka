package myproject;

public class Exception2 {
public static void main (String args[]) {
	int a[] = {1,2,3,4,5,6} ;
	try {
		System.out.println(a[6]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	finally {
		System.out.print("ArrayIndexOutOfBoundsException");
   }
  }
}
