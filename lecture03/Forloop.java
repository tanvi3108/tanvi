package lecture03;
import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:\n"); 


        //WAP to print numbers from 0 to 10 
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }

        //WAP to print first N even numbers
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        //WAP to print first N odd numbers
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++) {
        //     if(i%2!=0){
        //         System.out.println(i);
        //     }
        // }

        //WAP to find the sum of first N natural numbers
        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=1; i<=n; i++){
        //     sum +=i;
        // }
        // System.out.println(sum);

        //WAP to print first N natural numbers in reverse order
        // int n=sc.nextInt();
        // for(int i=n;i>=1; i--){
        //     System.out.println(i);
        // }

        //WAP to show two cases at once in for loop
        // int n=10;
        // for(int i=0, j=1; i<j&&j<n; i++,j++) {
        //     System.out.println(i+" "+j);
        // }

        //WAP to print the table of a number n
        //  System.out.println("Enter number: ");
        //  int n= sc.nextInt();
        //  for(int i=1; i<=10; i++){
        //      System.out.println(n*i);
        //  }
        
        //WAP to know if a number is prime or not 
        int n=sc.nextInt();
        boolean b=true; //Number is prime or not

        for(int i=2; i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
                
        }
        if(b==true){
            System.out.println("prime");
        }else{
            System.out.println("Not Prime");
        }


    }
}
