package STACKS.Questions;
import java.util.Arrays;
import java.util.Stack;
public class NSER {
    public static void nser(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[arr.length];
        Arrays.fill(ans, -1);
       for(int i=arr.length-1;i>=0;i--){
        while(stk.size()!=0 && stk.peek()>arr[i]){
            stk.pop();
        }
        if(!stk.isEmpty()){
            ans[i]=stk.peek();
        }
        stk.push(arr[i]);

       }
        for (int val : ans) {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={7,1,3,5,2,4,8,6};
        nser(arr);
    }
}
