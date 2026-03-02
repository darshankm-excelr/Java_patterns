
import java.util.Scanner;

class PrimeDigit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int digit=n%10;
            
            if(n%digit!=0){
                count++;
                
            }
            n=n/10;
            
        }
        System.out.println("prime Digit"+" "+count);
    }
}