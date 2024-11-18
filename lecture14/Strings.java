package lecture14;

public class Strings {
    public static void main(String[] args) {
        String s1="chicken";
        String s2="chicken";
        String s3=new String("chicken"); //its not the same as s1
        String s4="A";
        String s5="C";

        char[]s6=new char[10];
        System.out.println(s6);//prints blank space]
        s6[0]='s';
        s6[1]='i';
        s6[2]='x';
        System.out.println(s6);


        System.out.println(s1==s2); 
        System.out.println(s2==s3); 
        System.out.println(s3==s1); 
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.compareTo(s5));
        System.out.println(s3.substring(2,5));
        System.out.println(s3.length());
        System.out.println(s3.charAt(4));
        String s7=s4+s5;//adding
        System.out.println(s7);
        System.out.println(s4.concat(s5));//adding
        //diff bwn directly adding and concat function--> 
        String s8=10+12+20+s4+s5;
        String s9=s4+s5+10+12+20;

        System.out.println(s8);
        System.out.println(s9);

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());


    }
}
