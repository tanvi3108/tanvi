package Strings;

public class PalindromePossibleOrNot {
    
    public static void main(String[] args) {
        String str="aaabbb";
        int[]freq =new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int Ascii=ch;
            freq[Ascii]=freq[Ascii]+1;
            //freq[Ascii]++;   ------above line's replacement
        }
        int count=0;  //counts characters whose freq is odd
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                count++;
            }
        }
        if(count==0 || count==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
