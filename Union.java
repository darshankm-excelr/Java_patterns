import java.util.*;

class UnionProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Array Input
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Array Input
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Union Logic
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }

        // Print Union
        System.out.println("Union of two arrays:");
        for(Integer num : set) {
            System.out.print(num + " ");
        }
    }
}