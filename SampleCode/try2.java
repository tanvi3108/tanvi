package SampleCode;

import java.util.Scanner;

public class try2 {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();
        int[][]nums=new int[rows][cols];
        //INPUT
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        //OUTPUT
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                System.out.println(nums[i][j] + " ");
            }
        }
}

}
