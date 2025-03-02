package OOPs3;

class A{
    int a=13;
}
class B extends A{
    int b=15;
}
public class Inheritance {
    //client class
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.b);
        System.out.println(obj.a);

        A obj1=new A();
        B obj2=new B();
        A obj3=new B();
        B obj4=new A();//upcasting and downcasting
    }
}
