package lecture16.Recursion;

public class Example11 {
    public static void stairs(int n,String ans){
        //stairs problem
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0){
            return;
        }
        //1 ka jump
        stairs(n-1, ans+"1");
        //2 ka jump
        stairs(n-2, ans+"2");
    }
    public static void main(String[] args) {
      stairs(3,"");
    }
}
