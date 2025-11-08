import java.util.Scanner;
public class Factorial{
    public static int Factorial(int n){
       
          if(n==1||n==0)
          return 1; 
           
          return n*Factorial(n-1);
       
        
       
    }
       
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=Factorial(n);
         if(n<0){
         System.out.println("error:Negative number");
         
        }
        System.out.println(n+" " +"Factorial is:"+res);
        
    }
}