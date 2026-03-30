
import java.util.Arrays;

class ZiczacArray{
    public static int[] zigzac(int[]x,int y[]){
        
        int z[]=new int[x.length+y.length];
        int i=0;
        int k=0;
        for(;i<x.length&&i<y.length;i++){
            z[k++]=x[i];
            z[k++]=y[i];
        }
        while(i<x.length)
           z[k++]=x[i++];
        while(i<y.length)
           z[k++]=y[i++];
        
        return z;
    }
    public static void main(String[]args){
        int a[]={8,7,2,3};
        int b[]={9,4,2};
        int c[]=zigzac(a,b);
        System.out.println("A:"+Arrays.toString(a));
        System.out.println("B:"+Arrays.toString(b));
        System.out.println("C:"+Arrays.toString(c));
    }
}