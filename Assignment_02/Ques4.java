package Assignment_02;
import java.util.Scanner;
public class Ques4 {

    static void hollowRhombusPattern(int n){
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print stars and spaces for hollow rhombus
            for (int j = 0; j < n; j++) {
                // Print star for the borders (first and last row, or first and last column)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        hollowRhombusPattern(n);
    }
}
