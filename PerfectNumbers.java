
import java.util.Scanner;
class DivibleOf7And9{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
     int count = 0;

for(int i = 1; i <= n; i++) {
    if(i % 7 == 0 && i % 9 == 0) {
        count++;
    }
}

System.out.println("Count = " + count);
        }
    }