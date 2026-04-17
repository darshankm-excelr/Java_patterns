class ReverseWordInString{

    public static void main(String[]args){
     String st="rama is god boy";
     String res="";
     char []ch=st.toCharArray();
     for(int i=0;i<ch.length;i++){
        int f=i;
        while(i<ch.length&&ch[i]!=' ')
        i++;
        int l=i-1;
        while(l>=f)
        res=res+ch[l--];
        if(i<ch.length)

         res=res+ch[i];
     }
     System.out.println(res);
    }
}