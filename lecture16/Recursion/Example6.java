package lecture16.Recursion;

public class Example6 {
    //sum of array using recursion
    //takes array starting from i, returns sum of that array
    public static int sum(int[]arr,int i){
        if(i==arr.length){
            return 0;
        }
        int smallAns=sum(arr, i+1);
        int mainAns=arr[i]+smallAns;
        return mainAns;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(sum(arr,0));
    }
}
