

import java.util.Scanner;

public class HappyNumber {
	public static boolean HappyNumber(int n) {
		while(n>9) {
			n=sumOfDigit(n);
			
		}
		return n==1 ||n==7;
	}
	public static int sumOfDigit(int n) {
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
		}while(n!=0);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
	    System.out.println(HappyNumber(n));
		

	}

}
