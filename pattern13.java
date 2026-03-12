
import java.util.Scanner;

class pattern{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the n value:");
       String st=sc.nextLine();
        for(int i=1;i<=st.length();i++){
          
            for(int j=0;j<i;j++){
                System.out.print(st.charAt(j)+" ");
                
            }
            System.out.println(" ");
        }
    }
}