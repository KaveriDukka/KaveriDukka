package myproject;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("UI/UX");
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
  }
}
