package lecture10;

public class TimeComplexity {
    public static int sum(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(sum(n));
    }
}
