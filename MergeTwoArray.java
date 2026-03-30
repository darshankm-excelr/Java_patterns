
import java.util.Arrays;

class MergeTwoArray{
    public static int[] merge(int[]x,int y[]){
        int len1=x.length;
        int len2=y.length;
        int z[]=new int[len1+len2];
        for(int i=0;i<len1;i++){
            z[i]=x[i];
        }
        for(int i=0;i<len2;i++){
             z[x.length+i]=y[i];
        }
        return z;
    }
    public static void main(String[]args){
        int a[]={8,7,2,3};
        int b[]={9,4,2};
        int c[]=merge(a,b);
        System.out.println("A:"+Arrays.toString(a));
         System.out.println("B:"+Arrays.toString(b));
          System.out.println("C:"+Arrays.toString(c));
    }
}