
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
            int num=i%2;
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(num);
                num=(num==1)?0:1;
               
              
            }
            
           
            System.out.println();
        }
    }
}