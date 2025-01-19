package Strings;
import java.util.Scanner;
public class Q1 {
    public static void changeCase(){
            char ch='a';
            ch=(char)(ch-32);
            //ch=(char)(ch-('a'-'A'));-------can be this way as well
            //ch -=32;------shorthand way of the above line
            System.out.println(ch);
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            char ch=s.next().charAt(0);
            //identifying character

            //if(ch>='A' && ch<='Z')---------this can alse be used
            if(ch>=65 && ch<=90){
                System.out.println("uppercase");
            }
            else{
                System.out.println("lowercase");
            }
            

    }
}
