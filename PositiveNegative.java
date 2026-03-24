class PositiveNegative{
    public static int[] countNegPos(int [] arr){
        int neg=0,pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
              pos++;
            else
            neg++;
        }
        int [] ct={neg,pos};
        return ct;
    }
    public static void main(String[] args) {
        int []arr={23,12,-14,28,-1,-2,28};
        int []count=countNegPos(arr);
        System.out.println("NEgative numbers in array are:"+count[0]);
        System.out.println("positive numbers in array are:"+count[1]);
    }
}