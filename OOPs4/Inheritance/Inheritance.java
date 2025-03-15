package OOPs4.Inheritance;

class A{
    int a=13;
}
class B extends A{//B class ke paas A ki properties aagyi hain
    int b=15;
}
public class Inheritance {
    //client class
    public static void main(String[] args) {
        B obj=new B();
        A obj5=new A();

        System.out.println(obj.b);
        System.out.println(obj.a);

        A obj1=new A();
        B obj2=new B();
        A obj3=new B();
        System.out.println(obj5.a);
        System.out.println(obj5.b);// parent class ka object child class ke function ko call nhi kar sakta

        B obj4=new A();//upcasting 
    }
}
