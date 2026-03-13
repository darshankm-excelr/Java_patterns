
import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        
        
        for(int i=n;i>=1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
                
            }      
            for(int k=i;k>=1;k--){
                System.out.print(k);
              
            }
            
           
            System.out.println();
        }
    }
}