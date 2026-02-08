import java.util.Scanner;

class Angstrom {

    public static boolean isAngstrom(int n) {
        int original = n;
        int res = 0;
        int digit = String.valueOf(n).length();

        while (n > 0) {
            int d = n % 10;
            res += Math.pow(d, digit);
            n = n / 10;
        }

        return original == res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isAngstrom(n))
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
    }
}
