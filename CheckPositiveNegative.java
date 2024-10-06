package javabasics;

import java.util.Scanner;

public class CheckPositiveNegative {
public static void main(String[] args) {
	int x;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number : ");
	x = sc.nextInt();
	if(x>0) {
		System.out.println("positive");
	}
	else if(x<0) {
		System.out.println("negative");
	}
	else {
		System.out.println("zero");
	}
	
}
}
