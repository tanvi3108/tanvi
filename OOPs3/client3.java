package OOPs3;

class functions{
    public static void fun1(){
        int c=14;
        System.out.println("hello from static fun1");
    }
    public void fun2(){
        System.out.println("hello from non static fun2");
    }
}
public class client3 {
    public static void main(String[] args) {
        functions obj =new functions();
        obj.fun1();
        obj.fun2();
        functions.fun1();
        functions.fun2();//non accessible

    }
}
