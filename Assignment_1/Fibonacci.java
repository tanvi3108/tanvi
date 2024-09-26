package Assignment_1;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n)
    {
        if (n==0)
            return 0;
      else if(n==1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
