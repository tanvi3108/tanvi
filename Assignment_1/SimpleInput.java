package Assignment_1;
import java.util.Scanner;
public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        while(sc.hasNextInt())
        {
            n = sc.nextInt();
            sum = sum + n;
            if(n > -1000 && n < 1000)
            {
                if(sum >= 0)
                {
                    System.out.println(n);
                }
                else
                {
                    break;
                }
            }
        }

    }
}
