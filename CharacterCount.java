import java.util.Scanner;
class CharacterCount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        String st="java";
        
        System.out.println("length"+"-->"+st.length());
        System.out.println("concate"+"-->"+st.concat("hello"));
        System.out.println("character"+"-->"+st.charAt(2));
        System.out.println("Index"+"-->"+st.indexOf('j'));
        System.out.println("contains"+"-->"+st.contains("ja"));
        System.out.println("equal"+"-->"+st.equals("JAVA"));
        System.out.println("equalIgnore"+"-->"+st.equalsIgnoreCase("JAVA"));
        System.out.println("replace"+"-->"+st.replace('a', 'e'));
        System.out.println("substring"+"-->"+st.substring(0,3));
        System.out.println("tolowercase"+"-->"+st.toLowerCase());
        System.out.println("toUpper"+"-->"+st.toLowerCase());
        System.out.println("Split"+"-->"+st.split("@"));


        // char[]ch=str.toCharArray();
        // System.out.println(Arrays.toString(ch));
        // for(char c:ch){
        //     System.out.print(c);
        // }
        
    }
}