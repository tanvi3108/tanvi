package Strings;
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ans="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90){
                ch = (char)(ch+('a'-'A'));
            }
            else{
                ch = (char)(ch-('a'-'A'));
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
