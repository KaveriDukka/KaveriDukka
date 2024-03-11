package myproject;

public class OverLoading {
 void Multiplication (int a , int b) {
	 System.out.println("product =" +(a*b));
 }
 void Multiplication(int a , int b, int c) {
	 System.out.println("product =" +(a*b*c));
 }
 void Multiplication(int a, float b) {
	 System.out.println("product =" +(a*b));
 }
 void Multiplication(float a, int b) {
	 System.out.println("product =" +(a*b));
 }
 public static void main(String args[]) {
	 OverLoading OL = new OverLoading();
	 OL.Multiplication(5, 10);
	 OL.Multiplication(5, 10, 2);
	 OL.Multiplication(3, 5.2f);
	 OL.Multiplication(4.5f, 20);
 }
}
