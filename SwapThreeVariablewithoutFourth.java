package javabasics;

import java.util.Scanner;

public class SwapThreeVariablewithoutFourth {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	a=a+b+c;
	b=a-b-c;
	c=a-b-c;
	a=a-b-c;
	System.out.println("After Swapping : "+a+" "+b+" "+c);
			
}
}
