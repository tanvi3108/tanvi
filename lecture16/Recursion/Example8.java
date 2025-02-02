package lecture16.Recursion;

public class Example8 {
    //is the array sorted
    public static boolean check(int[]arr, int i){
        if(i==arr.length-1){
            return true;
        }
        boolean chotaAns=check(arr,i+1);
        if(chotaAns==false){
            return false;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(check(arr,0));
    }
}
