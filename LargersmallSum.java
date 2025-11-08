
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargersmallSum{
    public static int LargesmallSum(int[] arr){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        //even.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
             even.add(arr[i]);
             else
             odd.add(arr[i]);
        }
        Collections.sort(even);
         Collections.sort(odd);
      return even.get(even.size()-2)+odd.get(1);
    }

    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
     
     System.out.println(LargesmallSum(arr));
    }
}