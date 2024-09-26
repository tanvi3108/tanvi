package Assignment_1;
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();
     
        for(int i=minF;i<=maxF;i+=step){
            int C= ((5/9)*(i-32));
     
           System.out.println(i+" "+C);
        }
     
     }
}
