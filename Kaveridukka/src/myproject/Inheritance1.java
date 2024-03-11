package myproject;

 class Inheritance {
	 float salary=34534*12;    
 }    
 public class Inheritance1 extends Inheritance  {
 
 float bonus=3000*6;  
 public static void main(String args[])  
 {  
 Inheritance1 obj=new Inheritance1();   
 System.out.println("Total salary credited: "+obj.salary);    
 System.out.println("Bonus of six months: "+obj.bonus);
 }
 }

