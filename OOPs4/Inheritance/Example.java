package OOPs4.Inheritance;
class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    void display() {
        System.out.println("This is the child class");
    }
}

public class Example {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();   // Calling method from Parent class
        obj.display(); // Calling method from Child class
        Parent obj2=new Parent();
        obj2.show();//parent class ka object apne function ko call kr sakta h 
        obj2.display();// parent class ka object child class ke function ko call nhi kar sakta
    }
}
