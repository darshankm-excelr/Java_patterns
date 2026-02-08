 import java.util.Scanner;
 public class LongestNUmber{
    public static int isLongest(int n,int []arr){
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
            max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isLongest(n,arr));

    }
}