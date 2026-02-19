import java .util.Scanner;
class checkDigit{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n/10==0){
            System.out.println(n+"is digit");
        }
        else{
            System.out.println(n+"is number");
        }
    }
}