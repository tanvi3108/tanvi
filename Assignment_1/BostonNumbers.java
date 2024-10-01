package Assignment_1;

import java.util.Scanner;

public class BostonNumbers {
    public static void main(String[] args) {
      
   Scanner in = new Scanner(System.in);
        //System.out.print("Enter number: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("0");
            return;
        }

        boolean isComposite = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite && n != 1) {
            int sumDigits = 0;
            int t = n;
            while (t != 0) {
                int d = t % 10;
                sumDigits += d;
                t /= 10;
            }

            int sumPrimeDigits = 0;
            t = n;
            for(int i = 2; i < t; i++) {
                while(t % i == 0) {
                    t /= i;
                    int temp = i;
                    while (temp != 0) {
                        int d = temp % 10;
                        sumPrimeDigits += d;
                        temp /= 10;
                    }
                }
            }
            
            if(t > 2) {
                while (t != 0) {
                    int d = t % 10;
                    sumPrimeDigits += d;
                    t /= 10;
                }
            }

            if (sumPrimeDigits == sumDigits)
                System.out.println("1");
            else
                System.out.println("0");
        }
        else {
            System.out.println("0");
        }
      }
}
