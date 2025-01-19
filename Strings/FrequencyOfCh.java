package Strings;

public class FrequencyOfCh {
    //finding the frequency of each character
    public static void main(String[] args) {
        String str="aabccAd";
        int[]freq= new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int Ascii=ch;
            freq[Ascii]=freq[Ascii]+1;
            //freq[Ascii]++;   ------above line's replacement
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i] !=0){
                char ch=(char)i;
                System.out.println(ch+" -> "+ freq[i]);
            }
        }
    }
}
