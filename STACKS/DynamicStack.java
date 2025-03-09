package STACKS;

public class DynamicStack extends myStack {
    DynamicStack(int size){
        super(size);
    }
    //overriding
    public void push(int val)throws Exception{
        if(isFull()){
            int[]oldarr=arr;
            arr=new int[oldarr.length*2];
            for(int i=0;i<oldarr.length;i++){
                arr[i]=oldarr[i];
            }
        }
        arr[++top]=val;
    }
}
