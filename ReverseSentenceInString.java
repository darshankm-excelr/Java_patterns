class ReverseSentenceInString{

    public static void main(String[]args){
     String st="rama is god boy";
     String res="";
     char []ch=st.toCharArray();
     for(int i=ch.length-1;i>=0;i--){
        int l=i;
        while(i>=0&&ch[i]!=' ')
        i--;
        int f=i+1;
        while(f<=l)
        res=res+ch[f++];
        if(i>=0)

         res=res+ch[i];
     }
     System.out.println(res);
    }
}