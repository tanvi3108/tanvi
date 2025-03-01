package OOPs2;

class Student{
    //state
    String name;
    String rollNum;
    int marks;

    //constructor
    public Student(String val1, String val2, int val3){
        name=val1;
        rollNum=val2;
        marks=val3;
    }
    
    //behaviour
    void introduction(){
        System.out.println(name+" "+ rollNum +" "+marks);
    }
}
public class Client3 {
    public static void main(String[] args) {
    Student s1=new Student("Naman","23191102",40);
    Student s2=new Student("Mayank","23191103",45);
    System.out.println("naman Address"+s1);
    System.out.println("mayank Address"+s2);
    s1.introduction();
    s2.introduction();
    }
}
