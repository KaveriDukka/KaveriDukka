package myproject;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionAddmethod {

	public static void main(String[] args) {
		
		Collection <String> list = new LinkedList<String>();
		list.add("Java");
		list.add("CSS");
		list.add("HTML");
		
	   System.out.println("List is" +list);
	
	   list.add("Java Script");
	   list.add("PHP");
	
	   System.out.println("New List is" +list);
  
		
	}
	
}
