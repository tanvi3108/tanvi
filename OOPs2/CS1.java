package OOPs2;
class A{
    int a=12;//ye jaake heap mei create hoga
    A(int a){
        //this.a=13;
        //this.obj gets prioritized over local vaiable

        a=13;//sirf local variable a mei hi change karega
        //13- constructor ke saath hi khatam ho jayega kyoki constructor ek function h
    }
}
public class CS1{
    public static void main(String[] args) {
        A obj=new A(14);
        //14- assign hogi but constructor ke saath hi khatam ho jayegi, isliye 12 hi print hoga
        System.out.println(obj.a);
    }
}