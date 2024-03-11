package myproject;

public class Exception1 {
public static void main(String args[]) {
	int a[] = {3,4,5,6,7};
	try {
		System.out.println(a[4]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("e");
	}
	finally {
		System.out.print("finally block");
	}
  }
}
