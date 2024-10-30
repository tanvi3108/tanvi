package lecture08;

public class NGEL {
    static int[] NGEL(int[] arr){
        int maxElement= 0;
        int[] ngel= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ngel[i]= maxElement;
            maxElement= Math.max(arr[i], maxElement);
        }
        return ngel;
    }
    public static void main(String[] args) {
        int[] arr= {7,8,5,6,3,4,1,2};
        int[] num= NGEL(arr);
        for(int i:num){
            System.out.print(i+" ");
    }
}
}
