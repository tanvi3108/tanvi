package lecture16;

public class Recursion_basic {
    //head recursion
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    //head recursion
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    //tail recursion
    public static int Fact(int n,int k){
        if(n==1){
            return k;
        }
        return Fact(n-1,n*k);
    }
    //tail recursion
    public static int Power(int x, int n, int k){
        if(n==0){
            return k;
        }
        return Power(x,n-1,x*k);
    }

    public static int Fibonacci(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1||n==2){
        //     return 1;
        // }
        if(n==0||n==1){
            return n;
        }
        int fibo_1=Fibonacci(n-2);
        int fibo_2=Fibonacci(n-1);
        return fibo_1+fibo_2;
    }
    public static void main(String[] args) {
        int k=1;
        int x=3;
        int n=4;
        System.out.println(fact(n));
        System.out.println(power(x,n));
        System.out.println(Fact(n,k));
        System.out.println(Power(x,n,k));
        System.out.println(Fibonacci(n));
    }
}
