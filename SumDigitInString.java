
import java.util.Scanner;


public class SumDigitInString {
    public static int SumDigitInString(String str){
        int sum=0;
        for(char ch:str.toCharArray()){
            if(ch>='0' && ch<'9'){
                sum=sum+(ch-48);
            }
        }
        return sum;
    }

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      System.out.println(SumDigitInString(str));
  }
   
   
}
