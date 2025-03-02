package OOPs3;

class A{
    int a=12;
    static int b=13;
    void fun(){
        int c=14;
        System.out.println(c);
    }
}
public class client2 {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(A.a);//a ko class se access nhi kr sakte kyoki vo instance variable h
        System.out.println(A.b);
    }
}
