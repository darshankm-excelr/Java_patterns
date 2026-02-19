import java .util.Scanner;
class specialTwoDigit{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        switch (n%2) {
            case 0:
                System.err.println("even");
                break;
            case 1:
                System.err.println("odd");
                break;
        }
    }
}