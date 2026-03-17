
import java.util.Scanner;

class Pattern20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int ch=1;
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}