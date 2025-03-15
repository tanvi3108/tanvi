package STACKS.Questions;
import java.util.Arrays;
import java.util.Stack;

public class BalanceParenthesis {
    public static boolean isBalance(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                stk.pop();
            }
        }
        // if(stk.size()!=0){
        //     return false;
        // }
        // else{
        //     return true;
        // }

        return stk.isEmpty();
    }
    public static boolean isBalance2(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                else if(s.charAt(i)==')'&& stk.peek()=='('||s.charAt(i)==']'&& stk.peek()=='['||s.charAt(i)=='}'&& stk.peek()=='{')
                stk.pop();
            }
        }
        // if(stk.size()!=0){
        //     return false;
        // }
        // else{
        //     return true;
        // }

        return stk.isEmpty();
    }
 public static void main(String[] args) {
       
        String s="(())()";
        String s2="{[]}()";
        System.out.println(isBalance(s));
        System.out.println(isBalance2(s2));
    }
}
