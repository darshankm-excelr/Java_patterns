class reverse{
    public static String ReverseString(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);  
        }
        return t;
    }
    static boolean  isPolindrom(String s){
        if(s.equals(ReverseString(s))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="TAPACADEMY";
        System.out.println(isPolindrom(s));
    }
}