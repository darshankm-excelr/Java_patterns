import java.util.Scanner;
class Ntimes{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the N value:");
    int n=sc.nextInt();
    printName(1,n);

  }
  public static void printName(int i,int n){
    if(i>n)
    return;
    System.out.println("Darshan");
    printName(i+1, n);
  }
}