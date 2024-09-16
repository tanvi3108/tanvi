package lecture03;
import java.util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check prime: ");
        int n= sc.nextInt();
        // for(int i=1;i<=n;i++)
        //     System.out.println();
        //Find if N is prime or not

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

// package lecture03;
// public class Loops{
//     public static void main(String[] args) {

// //  //WAP to print numbers from 0 to 10       
// // for(int i=0; i<=10; i++){
// //     System.out.println(i);
// // }

// // //WAP to print first N even numbers
// // for(int i=1; i<=2*20;i++){
// //     if(i%2==0){
// //         System.out.println(i);
// //     }
// // }

// // //WAP to find the sum of first N natural numbers
// // int sum=0, n=4;
// // for(int i=1; i<=n;i++ ){
// //     sum+=i;
// // }
// // System.out.println(sum);


// // WAP to print first N natural numbers in reverse order
// // for(int i=10; i>=0; i--)
// // System.out.println(i);


// //WAP to print first n natural numbers using wile loop
// // int n=10;
// // int i=1;
// // while(i<=n){
// //     System.out.println(i);
// // }


// //two cases at once in for loop
// int n=10;
// for(int i=0, j=1; i<j&&j<n; i++,j++)
// {
// System.out.println(i+""+j);
// }
//     }
// }
// //write a program to know if a number is prime or not 
