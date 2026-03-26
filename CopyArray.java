import java.util.Arrays;
import java.util.Scanner;

public class CopyArray{
    public static int [] duplicate(int []a){
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");

        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        //int [] a={23,34,33,12};
        int[] b=duplicate(a);
        
        System.out.println(Arrays.equals(a,b));

    }
}