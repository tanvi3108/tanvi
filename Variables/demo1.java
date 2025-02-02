package Variables;

public class demo1 {
    static int k=14; //global variable/class variable
    public static void fun(){
        int a=3;  //local variable
        int b=4;  //local variable
        k=a+b;
        System.out.println(k);
    }
    public static void main(String[] args) {
        System.out.println(k);
        fun();
        System.out.println(k);
    }
}
