package Assignment_00;

import java.util.Scanner;

public class Q6_NthFibonacci {
    static int fib(int n){
    int a = 0;  //0th fibonacci
        int b = 1;  //1st fibonacci

        int i = 0;
        while (i < n) {

            int sum = a + b;
            a = b;
            b = sum;

            i++;
        }

        return a;
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
