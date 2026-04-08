import java.util.Scanner;

class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String st = sc.nextLine();

        int vc = 0, cc = 0, uc = 0, lc = 0, dc = 0, spc = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            // Uppercase
            if (ch >= 'A' && ch <= 'Z') {
                uc++;

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vc++;
                } else {
                    cc++;
                }
            }

            // Lowercase
            else if (ch >= 'a' && ch <= 'z') {
                lc++;

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vc++;
                } else {
                    cc++;
                }
            }

            // Digits
            else if (ch >= '0' && ch <= '9') {
                dc++;
            }

            // Space
            else if (ch == ' ') {
                spc++;
            }
        }

        System.out.println("Vowels: " + vc);
        System.out.println("Consonants: " + cc);
        System.out.println("Uppercase: " + uc);
        System.out.println("Lowercase: " + lc);
        System.out.println("Digits: " + dc);
        System.out.println("Spaces: " + spc);
    }
}