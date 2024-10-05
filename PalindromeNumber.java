package javabasics;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	int n,b,s,a;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	s=0;
	a=n;
	while(n!=0) {
		b=n%10;
		s=s*10+b;
		n=n/10;
	}
	if(s==a) {
		System.out.println("Yes Palindrome Number");
	}
	else {
		System.out.println("Not a palindrome number");
	}
}
}
