package lecture06;
public class ReverseArray {
    
    static void reverseDisplay(int[]arr){
    for(int i=4;i>=0;i--){
        System.out.println((arr[i]));
    }
    }
    
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        reverseDisplay(arr);
    }
}
