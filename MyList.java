import java.util.*;

class Geeks {

    public static void main(String[] args)
    {
        // Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("C++");
        li.add("");
        li.add("C++");
        

        System.out.println("Elements of List are:");

        // Iterating through the list
        for (String s : li) {
            System.out.println(s);
        }

}
}