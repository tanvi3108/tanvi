package lecture08;

public class NSEL {
    static int[] nsel(int[] arr){
        int[] NSEL= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minEle==Integer.MAX_VALUE)
                NSEL[i]=0;
            else
            NSEL[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSEL;
    }
    public static void main(String[] args) {
        int[] arr={9,6,4,1,7,3,5,2,8};
        int[] NSEL= nsel(arr);
        for(int i:NSEL)
            System.out.print(i+" ");
    }
}
