package lecture12;
import java.util.Scanner;
public class Populate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();
        int x=sc.nextInt();
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
            System.out.println();
        }
        //searching an element 
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                if(nums[i][j]==x){
                    System.out.println("x is found at:("+i+","+j+")");
                }
            }
        }
    }
}
