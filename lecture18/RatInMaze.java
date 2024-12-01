package lecture18;

public class RatInMaze {
    static int[][]ans=new int[100][100];
        public static void display(int x, int y){
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    System.out.print(ans[i][j]+" ");
                System.out.println();
            }
        }
    }
    public static boolean findCheese(int[][]maze,int i,int j,int x,int y){
        if(i==x&&j==y){
            ans[i][j]=1;
            return true;
        }
        ans[i][j]=1;
        if(i<=x){
            
        }
    }
    public static void main(String[] args) {
        int[][]maze={
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int x=3,y=4;
        int i=0,j=0;
        findCheese(maze,i,j,x,y);
    }
}
