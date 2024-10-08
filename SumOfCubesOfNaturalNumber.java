package javabasics;

import java.util.Scanner;

public class SumOfCubesOfNaturalNumber {
public static void main(String[] args) {
	int i,n,s;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	s=0;
	i=1;
	while(i<=n) {
		s=s+i*i*i;
		i=i+1;
	
	}
	System.out.println(s);
}
}
