import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= st; j++) {
                if(j == 1 || j == st) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();

            // update values AFTER completing row
            if(i <= n/2) {
                st = st + 2;
                sp--;
            } 
            else {
                st = st - 2;
                sp++;
            }
        }
    }
}