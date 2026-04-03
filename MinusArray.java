import java.util.Arrays;

class MinusArray {

    public static void main(String[] args) {
        int a[] = {2, 3, 4, 2};
        int b[] = {9, 4, 2, 1};

        int c[] = minus(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] minus(int a[], int b[]) {

        int z[] = new int[a.length];
        int k = 0; // ✅ move outside loop

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                z[k++] = a[i]; // store properly
            }
        }

        return Arrays.copyOf(z, k);
    }
}