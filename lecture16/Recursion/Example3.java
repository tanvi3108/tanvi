package lecture16.Recursion;
import java.util.Scanner;
public class Example3 {
    //takes n, returns first n natural numbers in decreasing order 
    public static void dec(int n){
        if(n==0){
            return;
        }  //-ve base case
        if(n==1){
            System.out.println(1);
            return;
        }  //+ve base case
        System.out.println(n);
        dec(n-1);
    }
    public static void main(String[] args) {
    dec(5);  
    }
}
