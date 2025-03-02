package STACKS;

class myStack{
    //state
    int[]arr;
    int top;
    //constructor
    myStack(int size){
        arr=new int[size];
        top=-1;
    }
    //behaviour
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("stk is full");
            return;
        }
        else{
            arr[++top]=val;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("stk is empty");
            return;
        }
        top--;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stk is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        myStack stk=new myStack(5);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk.peek());

    }
}
