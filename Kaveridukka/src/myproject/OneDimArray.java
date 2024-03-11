package myproject;

import java.util.Scanner;

public class OneDimArray {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter length of an Array:");
	int arrLength  = scan.nextInt();
	
	int [] anArray = new int[arrLength];
	System.out.println("Enter the elements of the Array");
	
	for (int i = 0; i<arrLength; i++) {
		anArray[i] = scan.nextInt();
	}
	System.out.println("One dimensional array elements are:");
	for (int i = 0; i<arrLength; i++) {
		System.out.print(anArray[i] + "");
	}
}
}
