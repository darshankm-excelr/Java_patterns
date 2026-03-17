import java.util.Scanner;

public class patter24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
               //M if(  j == n || j == 1 ||(i==j||i+j==n+1)&&i<=n/2+1 ) 
               // W if(  j == n || j == 1 ||(i==j||i+j==n+1)&&i>=n/2+1 )

                if(  j == n || j == 1 ||i==1||i==n||j==n/2+1||i==n/2+1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}