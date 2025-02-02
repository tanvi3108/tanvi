package lecture16.Recursion;

public class Example1 {
    public static int fact(int n){  //takes n and return n!
        if(n==0){
            return 1;
        }
        int chhotaAns=fact(n-1); //(n-1)!
        int meraAns=chhotaAns*n;
        return meraAns;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(fact(n));
    }
}
