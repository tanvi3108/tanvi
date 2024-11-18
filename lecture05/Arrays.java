package lecture05;

public class Arrays {
    public static void main(String[] args) {
        // int[] arr=new int[5];
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;
        // arr[4]=50;
        // int [] arr ={1,2,3,4,5};
        // System.out.println(arr[4]);

       
        // char[] s=new char[10];
        // s [0]='a';
        // s [1]='b';
        // s [2]='c';
        // System.out.println(s);


        int []arr; //declaration 
        //int arr[]; this is also a valid declaration
        arr= new int[5]; //initialisation
        int[] nums={1,2,3,4,5,6,7,8,9}; //this is populationg an array
        arr[0]=1;
        System.out.println(arr.length);

        arr = nums; // arr will point to the address of nums

        //   for(int i: arr)  // -----> to print the pointed array
        //   System.out.println(i+" ");

        System.out.println(arr); //-----> prints address
        System.out.println(arr.length);
        System.out.println(nums.length);
    }
}
