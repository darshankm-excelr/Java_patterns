

import java.util.Scanner;

public class checkXylumPhloeum {

    public static String checkXylumPhloem(int n) {
        
        int es = 0, ms = 0, t=n;

        
        while(n != 0) {
           
           int d  = n % 10;
           if(n==t||n==d)
             es=es+d;
           else
            ms=ms+d;
         n=n/10;
        }
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