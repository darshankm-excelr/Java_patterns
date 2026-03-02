

import java.util.Scanner;

public class checkXylumPhloeum {

    public static String checkXylumPhloem(int n) {
        
        int es = 0, ms = 0;

        es = es + n % 10;   
        n = n / 10;

        while(n > 9) {
            ms = ms + n % 10;   
            n = n / 10;
        }

        es = es + n; 

        return es == ms ? "Xylum" : "Phloem";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(n + " is a " + checkXylumPhloem(n));

        sc.close();
    }
}