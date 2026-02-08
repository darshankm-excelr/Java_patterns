import java.util.Scanner;

class AngstromNumber {

    // function to calculate power
    public static int powers(int b, int e) {
        int result = 1;
        for (int i = 1; i <= e; i++) {
            result *= b;
        }
        return result;
    }

    // function to check Armstrong number
    public static boolean isAngstrom(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += powers(d, digits);
            n /= 10;
        }

        return sum == original;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();   // starting limit
        int end = sc.nextInt();     // ending limit

        for (int i = start; i <= end; i++) {
            if (isAngstrom(i)) {
                System.out.println(i);
            }
        }
    }
}
