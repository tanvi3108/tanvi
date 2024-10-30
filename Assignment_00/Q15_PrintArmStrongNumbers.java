package Assignment_00;

import java.util.Scanner;

public class Q15_PrintArmStrongNumbers {
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      for(int i=n1; i<=n2; i++){
          if(armStrong(i)){
              System.out.println(i);
          }
      }
  }

  static boolean armStrong(int n){
      
      int len=0;
      int temp=n;
      while(temp!=0){
          temp/=10;
          len++;
      }

      int sum=0;
      temp=n;
      while(temp!=0){
          sum+=(int)Math.pow(temp%10, len);
          temp/=10;
      }
      return(sum==n);
      
  }
}
