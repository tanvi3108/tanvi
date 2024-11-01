package lecture07;

public class RotateArray3 {

    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void reverse(int[] nums, int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums, 0, nums.length-1);      //{5,4,3,2,1}
        reverse(nums, 0, k-1);                //{3,4,5,2,1}
        reverse(nums, k, nums.length-1);        //{3,4,5,1,2}
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k=3;
        rotate(nums, k);
        display(nums);
    }
}
