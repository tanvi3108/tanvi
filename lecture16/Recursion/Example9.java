package lecture16.Recursion;

public class Example9 {
    //takes an arr, returns sorted array
    public static void sort(int[]arr,int i){

        if(i==arr.length){
            return;
        }
        sort(arr,i+1);
        for(int j=i+1;j<arr.length;j++){
            if(arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,4,3,6,5};
        sort(arr,0);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
