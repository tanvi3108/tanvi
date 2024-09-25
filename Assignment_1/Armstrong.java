//Take the following as input.A number.
//Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

//A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
//abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

//1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
//371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

package Assignment_1;
import java.util.Scanner;
public class Armstrong {
    static boolean armStrong(int n){
        
        int len=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            len++;
        }

        int sum=0;
        temp=n;
        while(temp!=0){
            sum+=(int)Math.pow(temp%10, len);
            temp/=10;
        }
        return(sum==n);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(armStrong(n));
    }
    
}

