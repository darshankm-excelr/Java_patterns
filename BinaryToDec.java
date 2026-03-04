

import java.util.Scanner;

public class BinaryToDec {
	public static int BinarToDec(int bin) {
		int dec=0, p=1;
		do {
			int b=bin%10;
			dec=dec+b*p;
			p=p*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary number:");
		int bin=sc.nextInt();
		System.out.println(BinarToDec(bin));

	}

}
