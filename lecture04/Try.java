//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

package lecture04;
import java.util.Scanner;
public class Try {
    static int reverse(int n){
    //reversing the number
    int r = 0; 
        while (n != 0) { 
            r = (r * 10) + (n % 10); 
            n /= 10; 
        } 
        return r; 

    }
    static void getSum(int n){
        n=reverse(n);
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
        System.out.println("sum of odd placed digits: " + sumOdd);
        System.out.println("sum of even placed digits: " + sumEven);

    }
    public static void main(String[] args) {
                //taking input
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the number: ");
                int n=sc.nextInt();

                //System.out.println(reverse(n));
                getSum(n);
        

    }
    
}
