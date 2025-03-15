package OOPs4.Polymorphism;
class Student {
    String name;
    int age;
    // Constructor 1: No parameters
    Student() {
        name = "Unknown";
        age = 0;
    }
    // Constructor 2: One parameter
    Student(String studentName) {
        name = studentName;
        age = 0;
    }
    // Constructor 3: Two parameters
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();                // Calls Constructor 1
        Student s2 = new Student("Alice");         // Calls Constructor 2
        Student s3 = new Student("Bob", 20);       // Calls Constructor 3

        s1.display();  // Output: Name: Unknown, Age: 0
        s2.display();  // Output: Name: Alice, Age: 0
        s3.display();  // Output: Name: Bob, Age: 20
    }
}

