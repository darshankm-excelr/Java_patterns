
import java.util.Arrays;

class InsertIntoArray{
    public static int[] insert(int x[],int pos,int value){
      int z[]=new int[x.length+1];
      for(int i=0;i<pos;i++){
        z[i]=x[i];
      }
      z[pos]=value;
      for(int i=pos;i<x.length;i++){
        z[i+1]=x[i];
      }
      return z;
    }
    public static void main(String[]args){
        int x[]={1,3,4,5};
        int pos=1;
        int value=2;
        int r[]=insert(x,pos,value);
        System.out.println("befor insert:"+Arrays.toString(x));
        System.out.println("after insert:"+Arrays.toString(r));

    }
}