package myproject;

public class Exception3MultipleCatchblocks {
 public static void main(String args[]) {
	 try{    
         int a[]=new int[5];    
         a[5]=30/0;    
         System.out.println(a[10]) ;
	 }
	 catch(ArithmeticException e)  
     {  
      System.out.println("Arithmetic Exception occurs");  
     }    
  catch(ArrayIndexOutOfBoundsException e)  
     {  
      System.out.println("ArrayIndexOutOfBounds Exception occurs");  
     }    
  
     }             
  
}


