import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int n,i,flag;
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	if(n<=1) {
		System.out.println("Not Prime Number");
	}
	else {
		flag=0;
		for(i=2;i<(n/2)+1;i++) {
			if(n%i==0) {
				System.out.println("Not Prime Number");
				flag=1;
				break;		
			}
		}
		if(flag==0) {
			System.out.println("Prime Number");
		
		}
	}
		
	
}
}
