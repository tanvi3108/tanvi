package STACKS.Questions;
import java.util.Stack;

public class Ques2 {
    public static void insertAtBottom(Stack<Integer>s,int val){//using recursion
        if(s.size()==0){
            s.push(val);
            return;
        }
        int topElement=s.pop();
        insertAtBottom(s,val);
        s.push(topElement);
    }
    //question 1 using recursion
    public static void main(String[] args) {
        Stack<Integer>st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        insertAtBottom(st,50);
        System.out.println(st);
    }
}
