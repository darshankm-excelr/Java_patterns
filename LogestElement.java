import java.util.Scanner;

public class  LogestElement{
    public static int logestElemnt(int[] arr,int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>arr[0]){
                largest+=arr[i];
            }
           
        }
      return largest;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println(logestElemnt(arr,n));
    }  
}