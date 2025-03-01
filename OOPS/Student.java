package OOPS;

class B{
    //state
    String name;
    String rollNum;
    int marks;

    //behaviour
    void introduction(){
        System.out.println(name+" "+ rollNum +" "+marks);
    }
}
public class Student {
    public static void main(String[] args) {
        B student_1=new B();
        student_1.introduction();
        student_1.name="Tanvi";
        student_1.rollNum="23191100";
        student_1.marks=50;
        student_1.introduction();

        B student_2=new B();
        student_2.name="Saanvi";
        student_2.rollNum="23191101";
        student_2.marks=55;
        student_2.introduction();
    }
}
