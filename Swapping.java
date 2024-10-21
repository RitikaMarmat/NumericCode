package javabasics;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args) {
	int x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value");
	x=sc.nextInt();
	y=sc.nextInt();
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swapping : " +x+" "+y);
	
}
}
