// Take the following as input.
// A number
// A digit
// Write a function that returns the number of times digit is found in the number. Print the value returned.

package Assignment_1;
import java.util.Scanner;
public class DigitCount {
    static void digCount( int n, int d){
        int count = 0;
    
        while (n > 0){
            if(n%10==d){
                count++;
            }
            n/=10;
        }
        System.out.println(count); 
    }
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    int n=number.nextInt();
    Scanner digit = new Scanner(System.in);
    int d=digit.nextInt();
    
    digCount(n,d); 
}
}

