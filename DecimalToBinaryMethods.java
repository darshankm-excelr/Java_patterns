

import java.util.Scanner;

public class DecimalToBinaryMethods {
	static String DecToBinaryMethods(int dec) {
		String bin="";
		do {
			int b=dec%2;
			bin=b+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number:");
		int dec=sc.nextInt();
		System.out.println(DecToBinaryMethods(dec));
	}

}
