package javabasics;

import java.util.Scanner;

public class DisariumNumber {
public static void main(String[] args) {
	int n,count,a,b,sum;
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number : ");
	
	n=sc.nextInt();
	a=n;
	count=0;
	while(n!=0) {
		n=n/10;
		count=count+1;
	}
	n=a;
	sum=0;
	while(n!=0) {
		b=n%10;
		sum=sum+(b**count);
		count=count-1;
		n=n/10;
		
	}
	if(sum==a)
	{
		System.out.println("Disarium Number");
	}
	else {
		System.out.println("Not Disarium Number");
	}
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}
