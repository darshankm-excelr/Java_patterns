
import java.util.Scanner;

public class DecimalToOctal {
	static String DecToOctal(int dec) {
		String oct="";
		do {
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number:");
		int dec=sc.nextInt();
		System.out.println(DecToOctal(dec));
	}

}
