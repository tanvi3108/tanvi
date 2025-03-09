package OOPs4.Polymorphism;
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
        System.out.println("fun 1");
    }
    public void printInfo(int age){
        System.out.println(age);
        System.out.println("fun 2");
    }public void printInfo(String name, int age){
        System.out.println(name+ " "+ age);
        System.out.println("fun 3");
    }
}
public class CompileTimePoly {
    //compile time pr error pta chal jata h 
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="tanvi";
        s1.age=17;
        s1.printInfo(s1.name, s1.age);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
    }
}
