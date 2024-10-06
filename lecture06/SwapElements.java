package lecture06;

public class SwapElements {

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arr);
        swapElements(arr,1,5);
        printArray(arr);
    }

    static void swapElements(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
