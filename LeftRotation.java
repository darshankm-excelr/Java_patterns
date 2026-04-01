import java.util.Arrays;

class LeftRotation {
    public static int[] rotation(int[] x, int d) {
        d = d % x.length;

        while (d > 0) {
            int t = x[0];

            for (int i = 1; i < x.length; i++) {
                x[i - 1] = x[i];
            }

            x[x.length - 1] = t;
            d--;
        }

        return x;
    }

    public static void main(String[] args) {
        int x[] = {12, 32, 34};
        int d = 2;

        int res[] = rotation(x, d);

        
        System.out.println(Arrays.toString(res));
    }
}