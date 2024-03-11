package myproject;

import java.util.Iterator;
import java.util.LinkedList;


public class CollectionLinkedList2 {
    public static void main(String[] args) {
	LinkedList <String> Ll = new LinkedList<String>();
	
	Ll.add("Java");
	Ll.add("PHP");
	Ll.add("UI/UX");
	
	Iterator <String> itr  =  Ll.iterator();
	
	 while (itr.hasNext()) {
		System.out.println(itr.next()); 
	 }	
   }
}
