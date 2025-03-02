package STACKS;

import java.util.ArrayList;
import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        //ArrayList<Integer> arr=new ArrayList();
        Stack<Integer> stk=new Stack();
        stk.push(12);
        stk.push(10);
        stk.push(23);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk.peek());
        System.out.println(stk.size());
        System.out.println(stk);
    }
}
