import java.util.Scanner;
class UniqueCharacer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(st.indexOf(ch)==st.lastIndexOf(ch)){
                System.err.println(ch);
            }

            
        }
    }

}