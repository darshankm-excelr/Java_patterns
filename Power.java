package com.myapp;

import java.util.Scanner;

public class Powers {
    public static int getPower(int n,int p) {
    	int product=1;
    	while(p>0) {
    		product=product*n;
    		p--;
    	}
    	return product;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int p=sc.nextInt();
		System.out.println("enter p value:");
		int n=sc.nextInt();
		System.out.println(getPower(n,p));

	}

}
