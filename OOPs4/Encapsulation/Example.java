package OOPs4.Encapsulation;
// Encapsulation Example: Employee Class
class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 18) { // Validation to ensure correct data
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}

public class Example {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25);

        // Accessing data using getter methods
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());

        // Modifying data using setter methods
        emp.setName("Bob");
        emp.setAge(22);

        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Age: " + emp.getAge());
    }
}


