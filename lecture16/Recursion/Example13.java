package lecture16.Recursion;

public class Example13 {
    //find all combinations of binary form
    public static void binary(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        binary(n-1,ans+"0");
        binary(n-1,ans+"1");
    }
    public static void main(String[] args) {
        binary(4,"");
    }
}
