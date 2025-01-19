package Strings;

public class Q242 {
    public static void getFreqArr(String str){
        int[]freq=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int Ascii=ch;
            freq[Ascii]=freq[Ascii]+1;
            //freq[Ascii]++;   ------above line's replacement
        }
    }
    public static void main(String[] args) {
        
    }
}
