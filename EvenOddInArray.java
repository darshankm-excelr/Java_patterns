

class EvenOddInArray{
    public  static int[] countEvenOdd(int [] arr){
        int ec=0,od=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            ec=ec+1;
        }
        else{
            od=od+1;
        }
       
        
     }
      int [] ct={ec,od};
     return ct;
    }
    public static void main(String[] args) {
        int []arr={30,40,23,44};
        int[] count=countEvenOdd(arr);
        System.out.println("no of even:"+count[0]);
        System.out.println("no of odd:"+count[1]);
        //System.out.println(countEvenOdd(arr));
        
    }
}