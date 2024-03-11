package myproject;

public class Constructor {
int a,b;
public Constructor() {
	System.out.println("Constructor has been called");
}
public Constructor(int a, int b) {
	this.a = a;
	this.b = b;
}
public void addition() {
	System.out.println(a+ " + " +b+" = "+(a+b));
}
public void Difference() {
	System.out.println(a+ " - " +b+" = "+(a-b));
}
public void Product() {
	System.out.println(a+ " * " +b+" = "+(a*b));
}
public void Division() {
	System.out.println(a+ " / " +b+" = "+(a/b));
}
public void Modulus() {
	System.out.println(a+ " % " +b+" = "+(a%b));
}

public static void main(String[] args) {
	Constructor CR = new Constructor(5,2);
	CR.addition();
	CR.Difference();
	CR.Product();
	CR.Division();
	CR.Modulus();
}
}
