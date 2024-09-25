//Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

package Assignment_1;
import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;
 
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return dec_value;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
                    int num=sc.nextInt();
        //int num = 10101001;
        System.out.println(binaryToDecimal(num));
    }
}
