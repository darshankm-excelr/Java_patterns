
import java.util.Scanner;

class ReverseArray{
    public void reverse(int [] arr,int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        
    }
}