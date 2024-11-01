package Assignment_03;
import java.util.Scanner;
public class PascalTriangle3 {
    /*
    Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printPascalTriangle(N);
    }

    public static void printPascalTriangle(int N) {
        for (int row = 0; row < N; row++) {
            int number = 1; // Start with the first number in each row as 1
            
            // Print leading spaces for alignment
            for (int spaces = 0; spaces < N - row - 1; spaces++) {
                System.out.print(" ");
            }
            
            // Print the numbers in each row
            for (int col = 0; col <= row; col++) {
                System.out.print(number + " ");
                number = number * (row - col) / (col + 1); // Compute the next number in the row
            }
            System.out.println();
        }
    }
}



        

