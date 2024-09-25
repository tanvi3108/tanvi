//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
package Assignment_1;
import java.util.Scanner;
public class EvenOddSum {
    
        static void getSum(int n){
        
            int sumOdd=0, sumEven=0, c=1;
            while(n!=0){
                if(c%2==0){
                    sumEven += n%10;
                } else{
                    sumOdd += n%10;
                }
                n/=10;
                c++;
            }
            System.out.println(sumOdd);
            System.out.println(sumEven);
    
        }
        public static void main(String[] args) {
                    //taking input
                    Scanner sc = new Scanner(System.in);
                    int n=sc.nextInt();
    
                    //System.out.println(reverse(n));
                    getSum(n);
            
    
        }
}
