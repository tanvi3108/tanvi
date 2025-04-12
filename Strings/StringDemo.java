package Strings;

public class StringDemo {
    public static void main(String[] args) {
        //method 1--->new keyword method
        //this is just reference variable, string hasn't been created
        String str;
        String str1=new String("hello");

        //method 2--->string literal method
        String str2="Hello";

        System.out.println(str2);
        System.out.println(str1);
        //jab arr print krte the to address print hota h but string print kiya to content print hota h

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(0,4));
        System.out.println(str1.substring(0,5));
        System.out.println(str1.substring(0,0));//pehla index include hota h, baad wala exclude


        //String str1=new String("hello").intern();
        //isse ye normal heap nhi, string pool mei store hoga


    }
}
