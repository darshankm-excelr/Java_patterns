
import java.util.Scanner;

public class Stringconcatination{
    static String Concatination(String str1,String str2){
             String res=str1+str2;
             return res;
    }
    
       public static void main(String[] args) {
           Scanner sc=new  Scanner(System.in);
           System.out.println("enter Str1");
           String str1=sc.next();
           System.out.println("enter Str2");
           String str2=sc.next();
           System.out.println(Concatination(str1,str2));
       }
}