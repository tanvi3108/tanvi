package OOPs3;

class Z{
    int a=12;
    static int b=13;
    public static void fun1(){
        b++;
        System.out.println("hello from static fun1");
    }
    public void fun2(){
        b++;
        System.out.println("hello from non static fun2");
    }
}
public class CS1 {
    public static void main(String[] args) {
        Z obj=new Z();
        obj.fun1();
        obj.fun2();
        System.out.println(Z.b);
    } 
}
