package lecture11;

public class BS_onSearchSpace {
    static boolean check(int speed, int dist,int time){
        int dist_travelled=speed*time;
        return(dist_travelled>=dist);
    }

    static int reachCentre(int dist, int time){
        int low=0;
        int high=200;
        int ans=0;

        while(low<=high){
            int mid=(high+low)/2;
            if(check(mid,dist,time)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reachCentre(100,3));
    }
}
