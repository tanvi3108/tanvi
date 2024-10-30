package Assignment_02;
import java.util.Scanner;
public class Ques1 {

    static void hollowDiamondPattern(int n){
        for (int i = n/2+1; i >=1; i--) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("* ");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n/2+1; i++) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("* ");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        hollowDiamondPattern(n);
    }
}
