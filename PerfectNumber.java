
import java.util.Scanner;

class Arays{
  public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      
      String[] st=new String[n];


      for(int i=0;i<n;i++){
          st[i]=sc.nextLine();
      }
   for(String x:st){
    System.out.println(x);
   }

      
  }
}