//Take the following as input.
//A number (N1)
//A number (N2)
//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

package Assignment_00;
import java.util.Scanner;
public class Q13_PrintSeries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        
        int n=1;
        while(N1>0){
            if((3*n+2)%N2!=0){
                System.out.println(3*n+2);
                N1--;
            }
            n++;
        }
}
}