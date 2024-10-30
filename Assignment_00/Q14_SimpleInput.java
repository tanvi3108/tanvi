package Assignment_00;
import java.util.Scanner;
public class Q14_SimpleInput {
    //Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
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
