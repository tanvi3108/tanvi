package OOPs2;
class A{
    int a=12;
    A(int b){
        //a ain't a local variable hence no conflict, and a would be changed as per parameter passed
        a=b;
    }
}
public class CS2 {
    public static void swap(A obj1, A obj2){
        //situation 1------stack mei changes persist ni karengi
        // A temp=obj1;
        // obj1=obj2;
        // obj2=temp;

        //situation 2------
        int temp=obj1.a;
        obj1.a=obj2.a;
        obj2.a=temp;
    }
    public static void main(String[] args) {
        A obj1=new A(14);
        A obj2=new A(15);
        //jaisa data vaisa bucket
        System.out.println("Before swap "+ obj1.a+ " "+ obj2.a);
        swap(obj1,obj2);
        System.out.println("After  swap "+ obj1.a+ " "+ obj2.a);
        //result  of situation 1---------
        //before swap 14 15
        //After  swap 14 15

        //result  of situation 2---------
        //before swap 14 15
        //After  swap 15 14
    }
}
