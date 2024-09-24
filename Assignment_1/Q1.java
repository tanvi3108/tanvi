//Take n as input, Calculate it's reverse also Print the reverse.

package Assignment_1;
import java.util.Scanner;
public class Q1{
        static int reverse(int n){
            //reversing the number
            int r = 0; 
                while (n != 0) { 
                    r = (r * 10) + (n % 10); 
                    n /= 10; 
                } 
                return r; 
        
            }
            public static void main(String[] args) {
                        //taking input
                        Scanner sc = new Scanner(System.in);
                        int n=sc.nextInt();
        
                        System.out.println(reverse(n));
            }
    }
