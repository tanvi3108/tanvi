package OOPs3;
class staticDemo{
    int a=23;//instance variable/object variable
    static int b=45;//class variable/static variable
    void fun(){
        int c=12;//local variable
    }
}
public class client {
    public static void main(String[] args) {
        staticDemo obj=new staticDemo();
        System.out.println(obj.a);
    }
}
