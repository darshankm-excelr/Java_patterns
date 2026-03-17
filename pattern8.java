
import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}