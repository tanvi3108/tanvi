package Assignment_00;
import java.util.Scanner;
public class Q12_ReplaceThemAll {
   //Given a integer as a input and replace all the '0' with '5' in the integer
    static int replaceZerosWithOnes(int num) {
        if(num == 0) {
           return 5;
        }
        int ans = 0, temp = 1;
        while (num > 0) {
           int d = num % 10;
           if (d == 0) {
              d = 5;
           }
           ans = d * temp + ans;
           num = num / 10;
           temp = temp * 10;
        }
        return ans;
     }
  
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result = replaceZerosWithOnes(n);
        System.out.println(result);
     }
}
