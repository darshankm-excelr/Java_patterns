import java.util.Scanner;

class BinarySearch {

    public static int binarySearch(int[] n, int k) {
        int low = 0, high = n.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (k == n[mid]) {
                return mid;
            } 
            else if (k < n[mid]) {
                high = mid - 1;   // correct
            } 
            else {
                low = mid + 1;    // correct
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();      // size
        int[] n = new int[s];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();   // sorted array
        }

        int k = sc.nextInt();      // element to search

        System.out.println(binarySearch(n, k));
    }
}
