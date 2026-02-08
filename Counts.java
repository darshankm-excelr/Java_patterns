import java.util.Scanner;
class count{
     public static int countNumber(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;

    }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(countNumber(n));

  }
}