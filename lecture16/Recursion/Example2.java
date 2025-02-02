package lecture16.Recursion;

public class Example2 {
    public static int sumOfNaturalNum(int n){
        if(n==0){
            return 0;
        }//-ve base case--->invalid pr jaake rokna(zero pr rok diya)
        if(n==1){
            return 1;
        }//+ve base case----> valid case pr rok dena(one pr rok diya)
        
        int chhotaSum=sumOfNaturalNum(n-1);
        int meraAns=chhotaSum+n;
        return meraAns;
        //int sum=n+sumOfNaturalNum(n-1);
        //return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNaturalNum(n));
    }
}
