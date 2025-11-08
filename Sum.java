import java.util.Scanner;
public class Sum{
    public static int getSum(int n){
       if(n==0)
       return n;
       
       return n+getSum(n-1);
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number"); 
        int n=sc.nextInt();
        int res=getSum(n);
        
        
        System.out.println(n+" " +"Sum  is:"+res);
        
    }
}