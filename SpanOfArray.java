
import java.util.Scanner;

class SpanOfArray{
    public static int Span(int [] n){
        int max=n[0];
        int min=n[0];
        for(int i=1;i<=n.length-1;i++){
            if(n[i]>max){
                max=n[i];
            }
            if(n[i]<min){
                min=n[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] n = new int[size];       

        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();        
        }
        System.out.println(Span(n));
    }
}