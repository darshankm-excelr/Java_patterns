class sumOfArray{
    public static int SumArray(int [] x){
     int sum=0;
     for(int i=0;i<x.length;i++){
      sum+=x[i];
     }
     return sum;
    }
    public static void main(String[] args) {
        int arr[]={56,34,22,34,54};
        System.out.println(SumArray(arr));
    }
}