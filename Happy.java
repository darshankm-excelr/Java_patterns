import java.util.Scanner;
class automarphic{
   
     public static int Strong(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+getFact(d);
            n=n/10;
        }
        return sum;
     }
     public static int getFact(int d){
        int fact=1;
        while(d>1){
            fact=fact*d;
            d--;
        }
        return fact;
     }
     
    public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();

  System.out.println(Strong(n));
  
    }
}