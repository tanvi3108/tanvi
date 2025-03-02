package OOPs1;

class C{
    //state
    String name;
    String rollNum;
    int marks;

    //constructor
    public C(){
        name="naman";
        rollNum="23191102";
        marks=40;
    }
    public C(String val1, String val2, int val3){
        name=val1;
        rollNum=val2;
        marks=val3;
    }
    //ek se zada constructors bna sakte h but then unke parameters alag alag hone chiye
    
    //behaviour
    void introduction(){
        System.out.println(name+" "+ rollNum +" "+marks);
    }
}
public class Student2 {
    public static void main(String[] args) {
        //C student1=new C(); //constructor calling-----------
        /*agar hamare constructor mei 
        parameters passed hain to isme bhi parameters add krne padenge vrna error aayega*/
        C student1=new C("Naman","23191102",40);//constructor calling----
        student1.introduction();
        C student2=new C("Mayank","23191103",45);
        student2.introduction();
    }
}
