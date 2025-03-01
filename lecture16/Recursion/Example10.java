package lecture16.Recursion;

public class Example10 {
    //we'll create multiple sub-problems------>recursive tree
    //hint->ALL>to be solved by recursion
    //hint->choice> use recursion, more the number of choices>more the sub problems
    //hint-> explore all scenarios> use recursion

    //find the nth fibo no. using recursion
    //takes n, returns nth fibo number
    public static int fibo(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int chotaAns1=fibo(n-1);
        int chotaAns2=fibo(n-2);
        int meraAns=chotaAns1+chotaAns2;
        return meraAns;
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
