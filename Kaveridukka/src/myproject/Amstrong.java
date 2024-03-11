package myproject;

import java.util.Scanner;

public class Amstrong {
public static void main(String args[]) {
	int a,  arm=0, n, temp;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	n=scan.nextInt();
	temp=n;
	for( ;n!=0;n/=10 )
    {
        a=n%10;
        arm=arm+(a*a*a);
    }
    if(arm==temp)
    System.out.println(temp+" is a armstrong number ");
    else
    System.out.println(temp+" is not a armstrong number ");
}
}
