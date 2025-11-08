import java.util.Scanner;


public class Fabonocia{
    static int Fab(int n){
        if(n==0)
        return 0;
         int res=1;
         for(int i=1;i<=n;i++){
            res=res*i;
         }
         return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fab(n));
    }
}