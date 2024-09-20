package lecture04;
import java.util.Scanner;
public class Try {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //To print the table of a number n
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
