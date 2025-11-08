import java.util.HashMap;
public class RemoveDuplicate {
       public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 4, 1, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int num : arr) {
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
           for (var entry : map.entrySet()) {
             if (entry.getValue() > 1) {
                System.out.println("Element " + entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}