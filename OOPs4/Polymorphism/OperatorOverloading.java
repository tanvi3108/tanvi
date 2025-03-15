package OOPs4.Polymorphism;
public class OperatorOverloading {
    public static void main(String[] args) {
        // + used for addition
        int a = 10, b = 20;
        System.out.println(a + b);  // Output: 30

        // + used for string concatenation
        String first = "Hello";
        String second = " World";
        System.out.println(first + second);  // Output: Hello World

        // Mixing numbers and strings
        System.out.println("Sum: " + a + b); // Output: Sum: 1020 (left-to-right evaluation)
        System.out.println(a + b + " is the sum"); // Output: 30 is the sum
    }
}

