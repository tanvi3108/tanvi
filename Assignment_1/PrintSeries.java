//Take the following as input.
//A number (N1)
//A number (N2)
//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

package Assignment_1;
import java.util.Scanner;
public class PrintSeries {
    public static void main(String[] args) {
    Scanner first = new Scanner(System.in);
        int N1=first.nextInt();
    Scanner second = new Scanner(System.in);
        int N2=second.nextInt();
        
        int n=1;
        while((3*n+2)%N2!=0 && n<=N1){
            System.out.println(3*n+2);
            n++;
        }
    }
}
