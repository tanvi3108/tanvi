package Assignment_00;

import java.util.Scanner;

public class Q10_GCD {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
      
    int gcd = 1;
    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }
   System.out.println(gcd);
   
}
}
/* 
public static int gcd(int dividend, int divisor){

  while(dividend % divisor != 0){
      int rem = dividend % divisor;
      dividend = divisor;
      divisor = rem;
  }

  return divisor;
  }
*/
