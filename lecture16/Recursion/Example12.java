package lecture16.Recursion;

public class Example12 {
    //print all combinations of head and tail
    public static void printAll(int n, String ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        //head
        printAll(n-1, ans+"H");
        //tail
        printAll(n-1, ans+"T");
    }
    public static void main(String[] args) {
        printAll(3,"");
    }
}
