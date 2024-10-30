package lecture08;

public class TrappingRainWater {
    static int[] NGEL(int[] arr){
        int maxElement= 0;
        int[] ngel= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ngel[i]= maxElement;
            maxElement= Math.max(arr[i], maxElement);
        }
        return ngel;
    }
    static int[] NGER(int[] arr){
        int maxElement= 0;
        int[] nger= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]= maxElement;
            maxElement= Math.max(arr[i], maxElement);
        }
        return nger;
    }

    static int trappingRainWater(int[]height){
        int[]ngel=NGEL(height);
        int[]nger=NGER(height);
        int []level=new int[height.length];
        for(int i=0;i<level.length;i++){
            level[i]=Math.min(nger[i],ngel[i]);
        }
        int capacity=0;
        for(int i=0;i<level.length;i++){
            int temp=level[i]-height[i];
            if(temp>0){
                capacity+=temp;
            }
        }
        return capacity;
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));
    }
}
