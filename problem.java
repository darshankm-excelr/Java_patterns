import java.util.Arrays; 
public class problem{
    public static void main(String[] args) {
        int arr[]={1,4,6,3,4,8};
        System.out.println("original array"+ Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=-1;
        }
    }
        
        System.out.println("sorted array"+ Arrays.toString(arr));
        int k=2;
        int res=0;
        for(int i=0;i<k;i++){
             res=res+arr[i];
            System.out.println("sum is"+" "+res);
        }
    }
}