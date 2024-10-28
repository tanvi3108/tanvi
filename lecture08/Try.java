package lecture08;
import java.util.Scanner;
public class Try {
    
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
}
