package QUEUES;
import java.util.ArrayList;

class myQueue{
    ArrayList<Integer> arr;
        myQueue(){
            this.arr=new ArrayList();
        }
    
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void enqueue(int val){
        arr.add(val);
    }
    public void dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        arr.remove(0);
    }
    public int front() throws Exception{//calling function ko throw ke dete h, apni problem pass krdi
        if(isEmpty()){
           throw new Exception("queue is empty");//throw------activates JVM
        }
        int frontElement=arr.get(0);
        return frontElement;
    }
}
public class QueueUsingArrayList {
    public static void main(String[] args) throws Exception{
        myQueue q=new myQueue();
        q.enqueue(23);
        q.enqueue(24);
        q.enqueue(25);
        q.enqueue(26);

        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
    }
}
