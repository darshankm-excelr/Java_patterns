public class Count{
   
    static int[] countOddEven(int[] arr){
         int countEven=0,countOdd=0;
         for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
              countEven++;
        }else{
            countOdd++;
        }
         }
         return new int[] {countOdd,countEven};
        
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] ans=countOddEven(arr);
        System.err.println(ans[0]+" "+ans[1]);

    }
}