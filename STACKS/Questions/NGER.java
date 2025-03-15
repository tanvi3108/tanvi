package STACKS.Questions;
import java.util.Arrays;
import java.util.Stack;

public class NGER {
    public static void nger(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[arr.length];
        int i=arr.length-1;
        while(i>=0){
            if(stk.isEmpty()){
                ans[i]=-1;  
                stk.push(arr[i]);  
                i--;
            }
            else if(stk.peek()<arr[i]){
                stk.pop();
            }
            else{
                ans[i]=stk.peek();
                stk.push(arr[i]);
                i--;
            }
            
        }
        for (int val : ans) {
            System.out.print(val+" ");
        }
    }
    public static void nger2(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
        while(stk.size()!=0 && stk.peek()<arr[i]){
            stk.pop();
        }
        if(stk.isEmpty()){
            ans[i]=-1;
        }
        else{
            ans[i]=stk.peek();
        }
        stk.push(arr[i]);
       }
        for (int val : ans) {
            System.out.print(val+" ");
        }
    }
    public static void nger3(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[arr.length];
        Arrays.fill(ans, -1);
       for(int i=arr.length-1;i>=0;i--){
        while(stk.size()!=0 && stk.peek()<arr[i]){
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
        nger(arr);
        System.out.println();
        nger2(arr);
        System.out.println();
        nger3(arr);
    }
}
