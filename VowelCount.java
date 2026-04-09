import java.util.Scanner;
class VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        System.out.println(countVowel(str));
    }
    public static int countVowel(String str){
        int vc=0;
        String v="AEIOUaeiou";
        for(char ch:str.toCharArray()){
            if(v.indexOf(ch)!=-1)
              vc++;
        }

        return vc;
    }
    
}