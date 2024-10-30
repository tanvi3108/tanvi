package Assignment_00;
import java.util.Scanner;
public class Q17_BostonNumbers {
/*
The Question is Very Simple but needs a little extra concentration. As many students do not consider 
that in the Question it said the sum of digits of the given number is Equals to the sum of digits of 
its prime numbers is equal only when the number is Boston number.

For e.g.., n = 22
Prime Factors = 2 x 11
Sum of Digits = 2 + 2 = 4
Sum of Digits of Factors = 2 + (1 + 1) -> 4
Hence it is a Boston number.
 */

 public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
       // Calculating Sum of Digits
    int digitSum = sumDigits(n);
    int factorSum = 0;
      //Storing the number to equate it with the sum of digits of prime factors
    int onum = n;
    for (int div = 2; div <= Math.sqrt(n); div++) {
        if (isPrime(div)) {
            while (onum % div == 0) {
                factorSum += sumDigits(div);
                onum = onum / div;
            }
        }

    }
     //If the number is Still left
    if (onum >= 2) {
        factorSum += sumDigits(onum);
    }
        //check with the original numner
    if (factorSum == digitSum) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }
}

//Sum of Digits
public static int sumDigits(int n) {

    int sum = 0;

    while (n != 0) {
        int rem = n % 10;
        sum = sum + rem;
        n = n / 10;
    }

    return sum;
}
//Prime check
public static boolean isPrime(int n) {

    int factor = 0;

    int div = 2;

    while (div * div <= n) {

        if (n % div == 0) {
            return false;
        }

        div++;

    }

    return true;

}
}
