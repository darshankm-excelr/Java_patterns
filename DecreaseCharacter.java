public class DecreaseCharacter{
    public static void main(String[] args) {
        int n=5;
        char p='E' ;
        for(int i=1; i<=n;i++,p--){
            for(int j=i;j<=n;j++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
}