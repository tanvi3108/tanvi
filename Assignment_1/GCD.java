package Assignment_1;

import java.util.Scanner;

public class GCD {
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