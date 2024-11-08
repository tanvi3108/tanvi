package lecture11;

public class MagneticBalls {
    static boolean check(int force,int[]basket,int balls){
        int count=1;
        int last_basket=basket[0];
        for(int i=1;i<basket.length&&count<balls;i++){
            if(basket[i]-last_basket>=force){
                last_basket=basket[i];
                count++;
            }
        }
        return(count==balls);
    }

    static int maxDistance(int[]basket,int balls){
        int low=1;
        int high=basket[basket.length-1]-basket[0];
        int ans=1;

        while(low<=high){
            int mid=high-(high+low)/2;    //int range exceeding
            if(check(mid,basket,balls)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int basket[]={1,2,3,4,7};
        int balls=3;
        System.out.println(maxDistance(basket,3));
        System.out.println("bleh");
    }
}
