
import java.util.Scanner;
class Practice{
  public static int[] findMax(int a[]){
    for(int i=0;i<a.length;i++){
    int t=a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=t;
  
  }
  return a;
  }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int n=sc.nextInt();
      //int key=sc.nextInt();

      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
      }
     
        int res[]=findMax(a);

        System.out.println("Reveresed array:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
      


    }
}