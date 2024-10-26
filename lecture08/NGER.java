package lecture08;

public class NGER {
    static int[] NGER(int[] arr){
        int maxElement= 0;
        int[] nger= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]= maxElement;
            maxElement= Math.max(arr[i], maxElement);
        }
        return nger;
    }
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        int[] num= NGER(arr);
        for(int i:num){
            System.out.print(i+" ");
        }
}
}

