package lecture05;

public class Functions {
    static boolean armStrong(int n){
        
        int len=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            len++;
        }

        int sum=0;
        temp=n;
        while(temp!=0){
            sum+=(int)Math.pow(temp%10, len);
            temp/=10;
        }
        return(sum==n);

    }

    public static void main(String[] args) {
        int n=371;
        System.out.println(armStrong(n));
    }
    
}
