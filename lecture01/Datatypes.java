package lecture01;

public class Datatypes {
    public static void main(String[] args) {
        boolean b = true;
        boolean f = false;

        int a=10;
        int miniInt= Integer.MIN_VALUE ;
        int maxInt= Integer.MAX_VALUE; 
        
        float h= 11.07685577896f;
        float minifl= Float.MIN_VALUE;
        float maxfl= Float.MAX_VALUE; 

        double d= 6.78896788778645434467099876;
        double min_dbl= Double.MIN_VALUE;
        double max_dbl= Double.MAX_VALUE; 

        char c='a'; //A=65, a=97
        long l= 34567896;


        System.out.println();

        byte b1= Byte.MIN_VALUE;
        byte b2= Byte.MAX_VALUE;

        short sh= -12;
        short minish= Short.MIN_VALUE;
        short maxsh= Short.MAX_VALUE;



           System.out.println(b);
           System.out.println(f);
           System.out.println(a);
           System.out.println(miniInt);
           System.out.println(maxInt);
           System.out.println(h);
           System.out.println(minifl);
           System.out.println(maxfl);
           System.out.println(d);
           System.out.println(min_dbl);
           System.out.println(max_dbl);
           System.out.println(c);
           System.out.println(l);
           System.out.println(b1);
           System.out.println(b2);
           System.out.println(sh);
           System.out.println(minish);
           System.out.println(maxsh);
    }
}

/*
 byte    (1 byte)   (-128 to 127)
 short   (2 bytes)  (-32K to 32K)
 int     (4 bytes)  (-2B to 2B)                 (-2147483648 to 2147483647)
 long    (8 bytes) 
 float   (4 bytes)  (upto 6 decimal digits)
 double  (8 bytes)  (upto 16 decimal digits)
 char    (2 bytes)
 boolean (1 byte)   (true/false)
 */
