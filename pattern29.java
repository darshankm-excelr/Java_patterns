import java.util.Scanner;
class pattern29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print((char) ('A'+j));
                
            }
            
            
          
            System.out.println();
        }

    }
}