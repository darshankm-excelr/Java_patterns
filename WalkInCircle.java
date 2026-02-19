import java.util.Scanner;

class Walk {

    public static int WalkIn(int[] n, int k) {
        int w = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] <= k) {
                w += 1;
            } else {
                w += 2;
            }
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();   // size of array
        int k = sc.nextInt();   // threshold value

        int[] n = new int[s];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println(WalkIn(n, k));
    }
}
