

class BiggestElement{
    public  static int getbiggest(int [] arr){
        int big=arr[0];
     for(int i=1;i<arr.length;i++){
        if(arr[i]>big){
            big=arr[i];
        }
        
     }
     return big;
    }
    public static void main(String[] args) {
        int []arr={30,40,23,44};
        System.out.println(getbiggest(arr));
        
    }
}