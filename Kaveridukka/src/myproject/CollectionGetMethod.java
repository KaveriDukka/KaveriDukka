package myproject;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetMethod {
 public static void main (String[] args) {
	List <Integer> al = new ArrayList <Integer>(5);
	al.add(2);
	al.add(4);
	al.add(6);
	al.add(8);
	al.add(10);
	
  System.out.println("List is" +al);
  
  int element = al.get(3);
  
  System.out.println("Modified list is"  +element );
}
	
	
}
