import java.util.Scanner;

class Pattern20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();

        int sp = 0;
        int st = n;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }

            // logic
            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }

            System.out.println();
        }
    }
}