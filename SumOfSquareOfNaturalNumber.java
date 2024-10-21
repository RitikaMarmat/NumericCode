package javabasics;

import java.util.Scanner;

public class SumOfSquareOfNaturalNumber {
public static void main(String[] args) {
	int n,s,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	s=0;
	i=1;
	while(i<=n) {
		s=s+i*i;
		i=i+1;
	}
	System.out.println(s);
}
}
