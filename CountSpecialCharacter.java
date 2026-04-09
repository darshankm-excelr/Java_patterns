import java.util.Scanner;
class CountSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        System.out.println(countSpecialChar(str));


    }
    public static int countSpecialChar(String str){
    int spc=0;
    for(char ch:str.toCharArray()){
        if((ch>=65 & ch<=90 ||ch>=97 && ch<=122||ch>=48 && ch<=5)==false)
        spc++;
    }
    return spc;
    }
}