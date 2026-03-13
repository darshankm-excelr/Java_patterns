
import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        int ch=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
                
            }      
            for(int k=1;k<=i;k++){
                System.out.print(k);
                if(k<i){
                    System.out.print("*");
                }
              
            }
            
           
            System.out.println();
        }
    }
}