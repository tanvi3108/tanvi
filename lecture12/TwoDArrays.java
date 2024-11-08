package lecture12;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrays {
    static void populate(int[][]arr){
        int n=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=n;
                n++;
            }
        }
    }
    static void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    int[][]arr=new int[3][4];    //declaration and initialisation ->1
    int[][]nums={                //declaration and initialisation ->2
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
    };
    System.out.println(arr.length);  //no. of rows
    System.out.println(arr[0].length);  //no. of columns

    System.out.println(nums.length);  //no. of rows
    System.out.println(nums[0].length);  //no. of columns

    populate(arr);
    display(arr);
    }
}
