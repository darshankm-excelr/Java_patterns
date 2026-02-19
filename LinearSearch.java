
import java.util.Scanner;

class LinearSarch{
    public static int Binary(int []n,int k){
        for(int i=0;i<=n.length-1;i++){
          if(n[i]==k){
            return n[i];
            
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=2;
        int [] n={2,23,12,11};
        System.out.println(Binary(n,k));
    }

}