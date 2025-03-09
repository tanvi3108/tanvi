package STACKS;
class myStack{
    //state
    int[]arr;
    int top;//represent the index where the top element is stored
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
    public void push(int val)throws Exception{
        if(isFull()){
            System.out.println("stk is full");
            Exception e= new Exception("stack is full");
            throw e;
            //exception is a class
            //throw new Exception("stack is full");
            //JVM ke paas throw kiya jara h isko, throw mtlb address pass hua 
            //return;--->dont need return here
        }
        else{
            arr[++top]=val;
        }
    }
    public void pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack khali ho chuka h");

            // System.out.println("stk is empty");
            // return;
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
public class ExceptionHandling {
    public static void main(String[] args) {
        myStack stk=new DynamicStack(5);
        try{
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(stk.peek());
    }
}
