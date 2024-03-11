package myproject;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseOrder {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(50);
		al.add(100);
		al.add(150);
		al.add(200);

		Collections.sort(al, Collections.reverseOrder());

		System.out.println("Collections.reverseorder" + al);
	}

}
