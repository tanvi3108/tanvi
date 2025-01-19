package Strings;

public class SortString {
    public static int[] getFreArr(String str){
        int[] fre=new int[256];
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            int Ascii=ch;
            fre[Ascii]++;
        }
        return fre;
    }
    public static void main(String[] args) {
        String str="ababbde";
        int[]fre= getFreArr(str);
        String ans="";
        for(int i=0;i<fre.length;i++){
            if(fre[i]!=0){
                while(fre[i]>0){
                    ans +=(char)i;
                    fre[i]--;
                }
            }
        }
        System.out.println(ans);
    }
}
