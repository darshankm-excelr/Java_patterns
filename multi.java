
import java.util.Scanner;

class multi{
   public static int getMiddleValue(int a,int b,int c){
     if((a>c &&a<b)||(a>b&&a<c)){
         return a;
     }
     else if((b>c &&b<c)||(b>a&&b<c)){
         return b;
     }
     else{
      return c;
     }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first no");
      int a=sc.nextInt();
      System.out.println("enter second no");
      int b=sc.nextInt();
      System.out.println("enter third no");
      int c=sc.nextInt();
       System.out.println(getMiddleValue(a,b,c));

       
      
      // System.out.println(PrimeNumber(n));
        
      


      
    //   for (int i = 1; i <= 10; i++){
    //     System.out.println(n+" "+"*"+" "+i+" "+"="+" "+(n*i));
    //   }
    
    }
}