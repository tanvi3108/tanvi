package STACKS.Questions;
import java.util.Stack;

//reverse the stack
public class Ques3 {
    public static void reverse(Stack<Integer>s){
        if(s.size()==0){
            return;
        }
        int topElement=s.pop();
        reverse(s);
        insertAtBottom(s,topElement);
    }

    public static void insertAtBottom(Stack<Integer>s,int val){//using recursion
        if(s.size()==0){
            s.push(val);
            return;
        }
        int topElement=s.pop();
        insertAtBottom(s,val);
        s.push(topElement);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(s);
    }
}
