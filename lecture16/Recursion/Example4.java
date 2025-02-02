package lecture16.Recursion;

public class Example4 {
    //takes n, returns first n natural numbers in increasing order 
    public static void inc(int n){
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        inc(5);
    }
}
