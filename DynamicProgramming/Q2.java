package DynamicProgramming;

public class Q2 {
    //count path tabulation method
    public static int method1(int n, int m){
        int[][]dp=new int[n][m];
        for(int i=0; i<n; i++){
            dp[i][m-1]=1;
        }
        for(int j=0; j<m; j++){
            dp[n-j][j]=1;
        }
        for(int i=n-2;i>=0;i--){
            
        }
    }
    public static void main(String[] args) {
        
    }
}
