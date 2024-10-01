package lecture06;

public class RevValues {

    static void display(int[]arr){
        for(int i:arr)
        System.out.println(i+" ");
    }

    static void reverse1(int[]arr){
        int[] nums= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[nums.length-1-i]=arr[i];
        }
    }

    public static void main(String[] args) {
        //original array
        //create a new array
        //copy to original array

        //shallow copy
        //deep copy

        int[]arr={1,2,3,4,5};
        int[]nums={6,7,8,9,10};
        arr=nums;
        reverse1(arr);
        display(arr);
    }
}
