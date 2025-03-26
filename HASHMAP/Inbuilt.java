package HASHMAP;

public class Inbuilt {
    public static void main(String[] args) {
        //mapping of two data sets: double to integer 
        Double a=3.4;
        System.out.println(a.hashCode());

        Double b=3.4;
        System.out.println(b.hashCode());

        Boolean c=true;
        System.out.println(c.hashCode());

        Character bleh='a';
        System.out.println(bleh.hashCode());

        String str="abc";
        System.out.println(str.hashCode());

        String s1="Aa";
        String s2="BB";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        
    }
}
