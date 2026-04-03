


import java.util.Arrays;

class Intersection{
    public static int[] Intersection(int a[],int b[]){
        int z[]=new int[a.length];
        int k=0;
       for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
           if(a[i]==b[j]){
             z[k++]=a[i];
             break;
           }
        }
       }
       int rs[]=new int[k];
       for(int i=0;i<k;i++){
        rs[i]=z[i];
       }
       return rs;
       
    }

    
    public static void main(String[]args){
        int a[]={2,4,3,1};
        int b[]={5,6,3,4};
        
       int c[]=Intersection(a,b);
       System.out.println(Arrays.toString(c));
       
      
    }
}