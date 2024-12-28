package lecture08;

public class NextGreatest_Right {
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
        int[] arr= {7,8,5,6,3,4,1,2};
        int[] num= NGER(arr);
        for(int i:num){
            System.out.print(i+" ");
        }
}
}

