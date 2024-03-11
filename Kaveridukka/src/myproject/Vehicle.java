package myproject;

abstract class Vehicle {
  private static  String name;
  
  public Vehicle (String name) {
	 Vehicle.name = name;
  }
  abstract void brake();
  
  public String getname() {
	  return name;
  }
  
  static  class Bike extends Vehicle {
	  public Bike() {
		  super(name);
	  }
	  public void brake() {
		  System.out.println("Bike brakes...");
	  }
  }
   static class Car extends Vehicle {
	   public Car() {
		   super(name);
	   }
	   public void brake() {
		    System.out.println("Car brakes...");
	   }
   }
   
   
   public static void main(String args[]) {
	   Bike b1 = new Bike();
	   Car c1 = new Car();
	   b1.brake();
	   c1.brake();
   }
}
//Inheritance example