package STACKS.Questions;

import java.util.Stack;

public class Ques1 {
    public static void insertAtBottom(Stack<Integer>s,int val){
        Stack<Integer>temp=new Stack();
        while(s.size()>0){
            int topElement=s.pop();
            temp.push(topElement);
        }
        s.push(val);
        while(temp.size()>0){
            int topElement=temp.pop();
            s.push(topElement);
        }
    }
    
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
