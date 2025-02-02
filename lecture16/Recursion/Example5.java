package lecture16.Recursion;

public class Example5 {
    //optimised way of the same problem
    //i index se start hone wale array se print hoga
    public static void printArrOptm(int[]arr,int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        printArrOptm(arr,i+1);
    }
    //printing an array using recursion
    //takes an array, prints it
    public static void printArray(int[]arr){
        if(arr.length==0){
            return;
        }

        System.out.print(arr[0]+" ");
        int[] smallerArr=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallerArr[i-1]=arr[i];
        }
        printArray(smallerArr);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        printArray(arr);
        System.out.println();
        printArrOptm(arr,0);
    }
}
