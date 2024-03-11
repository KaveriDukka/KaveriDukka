package myproject;
import java.util.*; 

public class ArrayList2Iterator {
 
	  
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();
	  list.add("Java");  
	  list.add("PHP");    
	  list.add("Java Script");    
	  list.add("UI/UX");    
	  
	  Iterator<String> itr=list.iterator();
	  while(itr.hasNext()){ 
	   System.out.println(itr.next());
	  }  
	 }  
	}  

