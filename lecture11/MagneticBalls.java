package lecture11;

public class MagneticBalls {
    static boolean check(int force,int[]position,int m){
        int count=1;
        int last_basket=position[0];
        for(int i=1;i<position.length&&count<m;i++){
            if(position[i]-last_basket>=force){
                last_basket=position[i];
                count++;
            }
        }
        return(count==m);
    }

    static int maxDistance(int[]position,int m){
        int low=1;
        int high=position[position.length-1]-position[0];
        int ans=1;

        while(low<=high){
            int mid=high-(high+low)/2;    //int range exceeding
            if(check(mid,position,m)){
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
        int position[]={1,2,3,4,7};
        int m=3;
        System.out.println(maxDistance(position,3));
        System.out.println("bleh");
    }
}
