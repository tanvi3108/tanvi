package OOPs4;
//compile time polymorphism=> METHOD OVER-LOADING or EARLY BINDING
class A{
    int a=1;

    public void fun(int a ){
        System.out.println("fun of int is called");
    }
    public void fun(String a){
        System.out.println("fun of string is called");
    }
    public void fun(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    public int fun(String a, int b, int c){
        System.out.println("hello from fun from class A");
        return 12;
    }
    //function ka return type change kr doge to vo compile time polymorphism mei nhi aayega, return type se koi farak nhi padega
}

//run time polymorphism=> METHOD OVER-RIDING or LATE BINDING
class B extends A{
    int a=2;
    public int fun(String a, int b, int c){
        System.out.println("hello from fun from class B");
        return 12;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        //A obj=new A();
        // obj.fun("car");
        // obj.fun(2);
        // obj.fun(3,4);
        
        //B obj=new B();
        A obj=new B();
        System.out.println(((B)obj).a);//tycasting 
        obj.fun("abc",2,3);//over riding
    } 
}
