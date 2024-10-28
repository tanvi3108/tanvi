package lecture03;
import java.util.Scanner;
public class Forloop {

    public static void num0to10(){
        //WAP to print numbers from 0 to 10 
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void evenNumbers(int n){
        //WAP to print first N even numbers
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void oddNumbers(int n){
        //WAP to print first N odd numbers
        for(int i=1; i<=n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void sumNaturalNum(int n){
       //WAP to find the sum of first N natural numbers
        int sum=0;
        for(int i=1; i<=n; i++){
            sum +=i;
        }
        System.out.println(sum); 
    }
    public static void reverseNaturalNum(int n){
        //WAP to print first N natural numbers in reverse order
        for(int i=n;i>=1; i--){
            System.out.println(i);
        }
    }
    public static void twoCases(int n){
        //WAP to show two cases at once in for loop
        for(int i=0, j=1; i<j&&j<n; i++,j++) {
            System.out.println(i+" "+j);
        }
    }
    public static void multiples(int n){
        //WAP to print the table of a number n
         for(int i=1; i<=10; i++){
             System.out.println(n*i);
         }
    }
    public static void primeOrNot(int n){
         //WAP to know if a number is prime or not 
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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:"); 
        int n=sc.nextInt();

        num0to10();
        evenNumbers(n);
        oddNumbers(n);
        sumNaturalNum(n);
        reverseNaturalNum(n);
        twoCases(n);
        multiples(n);
        primeOrNot(n);
    }
}
