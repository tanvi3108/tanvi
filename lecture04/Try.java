//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

package lecture04;
import java.util.Scanner;
public class Try {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    if (isArmstrong(number)) {
        System.out.println(number + " is an Armstrong number.");
    } else {
        System.out.println(number + " is not an Armstrong number.");
    }
}

public static boolean isArmstrong(int number) {
    int originalNumber = number;
    int numDigits = String.valueOf(number).length();
    int sum = 0;
    while (number != 0) {
        int digit = number % 10;
        sum += Math.pow(digit, numDigits);
        number /= 10;
    }
    return sum == originalNumber;
    }

}
