class SpecifiedElement{
    public static int countAppearence(int [] arr,int key){
        int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
        count++;
       }
       return count;
    }
    public static void main(String[] args) {
        int  []arr={34,99,87,65,34,54,34};
        int key=34;
        int rs=countAppearence(arr,key);
        System.out.println("Element "+key+"occure  in array is:"+rs+" "+ "times");
    }
}