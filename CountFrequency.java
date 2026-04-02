

class CountFrequency{
    public static void count(int arr[]){
        boolean rs[]=new boolean[arr.length];
         
         for (int i= 0; i < arr.length; i++) {
            if (rs[i] == false) {
                    int count=1;
            
            for (int j = i + 1; j < arr.length; j++) {
                
                   if(arr[i]==arr[j]){
                    count++;
                    rs[j]=true;
                   } 
                }
                System.out.println(arr[i]+"-->"+count);
            }

         
        }
        
    }
    
    public static void main(String[]args){
        int arr[]={7,10,10,3,-1,-2,-1,-16,9};
        
        count(arr);
    }
}