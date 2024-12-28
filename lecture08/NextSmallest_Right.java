package lecture08;

public class NextSmallest_Right {
    static int[] nser(int[] arr){
        int[] NSER= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(minEle==Integer.MAX_VALUE)
                NSER[i]=0;
            else
            NSER[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSER;
    }
    public static void main(String[] args) {
        int[] arr={7,8,5,6,3,4,1,2};
        int[] NSER= nser(arr);
        for(int i:NSER)
            System.out.print(i+" ");
    }
}
