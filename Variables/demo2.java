package Variables;

public class demo2 {
    int c;// instance variable----can't be accessed in static function
    static int a;/* (global variable)if not initialised by us,
     it gets the automatically initialisation acc. to its data type---int ke acc. 0 initialise hogya  */

    public static void fun(){
        int b;//local variable mei khud initialisation nhi hoti default value------local variables can't be used without initialisation, isn't accessible
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println(a);
        fun();
    }
}
