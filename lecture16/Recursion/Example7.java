package lecture16.Recursion;

public class Example7 {
    //reverse an array using recursion
    public static void reverse(int[]arr,int i,int j){
        if(j<i){
            return;
        }
        reverse(arr,i+1,j-1);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        reverse(arr,0,arr.length-1);
        //for-each loop index pr iterate ni krta, usme rakhi hui value pr iterate krta h
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
