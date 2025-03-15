package OOPs4.Polymorphism;
class Animal {  
    void sound() {  // Superclass method
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {  
    @Override  // Overriding the method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePoly {  
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting (Parent reference, Child object)
        myAnimal.sound();  // Calls the overridden method in Dog class
    }
}

