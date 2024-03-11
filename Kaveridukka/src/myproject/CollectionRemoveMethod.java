package myproject;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveMethod {

	public static void main(String[] args) {
		
		List<Integer> List = new ArrayList<Integer> ();
		List.add(100);
		List.add(200);
		List.add(300);
		List.add(400);
		List.add(500);
		
	System.out.println("Original list is " +List);
		
	List.remove(1);
	List.remove(2);
	
	System.out.println("Modified list is" +List);
	}
}