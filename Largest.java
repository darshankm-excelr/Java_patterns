
import java.util.Scanner;

class Largest{
    public int largestElement(int[]nums){
       int largest=nums[0];
       for(int i=1;i<=nums.length-1;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
       } 
       return largest;
    }
    public static void main (String[]args){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int nums[]=new int[n];
      for(int i=0;i<nums.length;i++){
     nums[i]=sc.nextInt();
      }
      System.out.println(largestElement(int []nums));
    }
}