import java.util.Scanner;
class automarphic{
    public static boolean Automarphic(int n){
        int sq=n*n;
        do { 
            if(n%10!=sq%10)
            return false;
            n=n/10;
            sq=sq/10;
        } while (n!=0);
        return true;
    }
    public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  boolean rs=Automarphic(n);
  if(rs){
    System.out.println(rs);
  }
  else{
    System.out.println("not");
  }
    }
}