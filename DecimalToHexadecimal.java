import java.util.Scanner;

public class DecimalToHexadecimal {

    static String decToHex(int n){

        String digits = "0123456789ABCDEF";
        String hex = "";

        do{
            int r = n % 16;
            hex = digits.charAt(r) + hex;
            n = n / 16;

        }while(n != 0);

        return hex;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int n = sc.nextInt();

        System.out.println("Hexadecimal: " + decToHex(n));
    }
}