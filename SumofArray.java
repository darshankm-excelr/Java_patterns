
import java.util.Scanner;

public class SumofArray{
    static int Sum(int n,int[]ar){
       int  sum1=0;
       int sum2=0;
       for(int i=0;i<ar.length;i++){
        sum1=sum1+ar[i];
       }
       n=n+1;
       sum2=n*(n+1)/2;
       int res=sum2-sum1;
         return res;
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Sum(n,arr));
    }
}