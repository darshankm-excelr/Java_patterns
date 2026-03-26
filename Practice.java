
import java.util.Scanner;
class Practice{
  public static int SumArray(int a[]){
int sum=0;int avg=0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
      
    }
    avg=sum/a.length;
    return avg;
    
  }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int n=sc.nextInt();

      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
      }
     
        System.out.println(SumArray(a));
      


    }
}