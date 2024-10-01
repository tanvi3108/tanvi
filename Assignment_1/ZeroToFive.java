package Assignment_1;
import java.util.Scanner;
public class ZeroToFive {
    static int replaceZerosWithOnes(int num) {
        if(num == 0) {
           return 5;
        }
        int ans = 0, tmp = 1;
        while (num > 0) {
           int d = num % 10;
           if (d == 0) {
              d = 5;
           }
           ans = d * tmp + ans;
           num = num / 10;
           tmp = tmp * 10;
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
