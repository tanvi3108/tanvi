package DynamicProgramming;

public class Q1 {
    //matrix path count
    public static int getCount(int currRow, int currCol,int desRow, int desCol, int[][]dp){
        if(currRow==desRow && currCol==desCol){
            return -1;
        }
        if(currRow>desRow || currCol>desCol){
            return 0;
        }
        if(dp[currRow][currCol]!=-1){
            return dp[currRow][currCol];
        }
        //right move
        int ans1=getCount(currRow,currCol+1,desRow,desCol,dp);
        //down move
        int ans2=getCount(currRow+1,currCol,desRow,desCol,dp);

        int meraAns=ans1+ans2;
        return meraAns;
    }
    public static void main(String[] args) {
        int [][] dp=new int[3][3];

        System.out.println(getCount(0,0,2,2,dp));
    }
}
