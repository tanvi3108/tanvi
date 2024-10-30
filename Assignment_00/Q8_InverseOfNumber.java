package Assignment_00;
import java.util.Scanner;
public class Q8_InverseOfNumber {

    //Inverse is basically inverting the places of any number with its value.
    /*For e.g..,
Before Inverse

Places --> 5 4 3 2 1
Value ---> 3 2 1 4 5
After Inverse

Places --> 5 4 3 2 1
Value ---> 1 2 5 4 3
 */
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
