package Assignment_1;
import java.util.Scanner;
public class InverseOfNumber {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long inverse=0; 
        int rem=0, i=1;
        while(n>0){
            rem=n%10;
            inverse= inverse+ (long) (i*(Math.pow(10,rem-1)));
            n/=10;
            i++;
        }  
        System.out.println(inverse);
    }
    
}
