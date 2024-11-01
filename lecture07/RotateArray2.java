package lecture07;

public class RotateArray2 {

    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static void rotateUsingIndex(int[] arr, int k) {
        int[] temp=new int[arr.length];
        int n=arr.length;
        k=k%n;
        for(int i=0;i<n-k;i++){     //{1,2,3,1,2}
            temp[i+k]=arr[i];       
        }
        for(int i=0;i<k;i++){      //{3,4,5,1,2}
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n;i++){      //{3,4,5,1,2}
            arr[i]=temp[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;
        rotateUsingIndex(arr, k);
        display(arr);
    }
}
