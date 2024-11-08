package lecture11;

public class RepairingCars {
    boolean check(int[]ranks,int cars,int time){
        int count=0;
        for(int i=0;i<ranks.length;i++){
            count+=Math.sqrt(time/ranks[i]);
        }
        return(count>=cars);
    }

    public long repairCars(int[]ranks, int cars){
        long low=1,high=Long.MAX_VALUE;
        long ans=high;

    }
    public static void main(String[] args) {
        int[]ranks={4,3,2,1};
        int cars=10;
    }
}
