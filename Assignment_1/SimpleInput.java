package Assignment_1;
import java.util.Scanner;
public class SimpleInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();

        int sum=a+b+c+d+e;

        while(!(sum<0)){
            System.out.println();
        }
    }
}
