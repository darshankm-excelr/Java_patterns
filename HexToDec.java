
import java.util.Scanner;

class HexToDec{
    public static String hexToDecimal(String hx){
     String st="0123456789ABCDEF";
     int dec=0,p=1;
     for(int i=hx.length()-1;i>=0;i--){
        char ch=hx.charAt(i);
        dec=dec+st.indexOf(ch)*p;
        p=p*2;

     }
     return String.valueOf(dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hexaDecimal:");
        String hx=sc.nextLine();
        System.out.println(hexToDecimal(hx));
        
    }
}