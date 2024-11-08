package lecture12;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysSort {
    //Display
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Sort 2D Array: By Rows, By Cols, Whole 2D Array
    //Rows
    static void sortByRows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }
    //cols
    static void sortByCols(int[][] nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0], b[0]));  
    }
    //Whole Matrix
    static void sortComplete(int[][] nums){
        int[] arr= flaten(nums);
        Arrays.sort(arr);
        fillArray(nums, arr);
    }
    static void fillArray(int[][] nums, int[] arr){
        int rows= nums.length;
        int cols= nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[cols*i + j];
            }
        }
    }
    static int[] flaten(int[][] nums){
        int rows= nums.length;
        int cols= nums[0].length;
        int[] arr= new int[rows * cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i + j]= nums[i][j];
            }
        }
        return arr;
    }
    //Linear Search
    static int[] search(int[][] nums, int n){
        int[] ans= new int[2];
        //code
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    //Transpose
    static void transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]= temp;
            }
        }
    }
    public static void main(String[] args) {
    int[][] nums = new int[2][3];
    int[] arr = {5, 2, 6, 4, 1, 3};
    display(nums);
    fillArray(nums,arr);
    display(nums);
    flaten(nums);
    display(nums);
    sortByRows(nums);
    display(nums);
    sortByCols(nums);
    display(nums);
    sortComplete(nums);
    display(nums);
    transpose(nums);
    display(nums);

}
}
