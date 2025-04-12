package PQ;
import java.util.ArrayList;

    class MyPriorityQueue {
        ArrayList<Integer>arr;
        MyPriorityQueue(){
            arr=new ArrayList();
        }
        public int leftChild(int pi){
            return 2*pi+1;
        }
        public int rightChild(int pi){
            return 2*pi+2;
        }
        public int parentIndex(int ci){
            return (ci-1)/2;
        }


        public int size(){
            return arr.size();
        }
        public int peek() throws Exception{
            if(size()==0){
                throw new Exception("PQ is empty");
            }
            return arr.get(0);
        }

        public void swap(int index1, int index2){
            int temp=arr.get(index1);
            arr.set(index1,arr.get(index2));
            arr.set(index2,temp);
        }
        public void upheapify(int ci){
            if(ci==0){
                return;
            }

            int pi =parentIndex(ci);
            if(arr.get(pi)>arr.get(ci)){
                swap(pi,ci);
                upheapify(pi);
            }
        }
        public void add(int val){
            arr.add(val);
            upheapify(arr.size()-1);
        }
        public void downheapify(int pi){
            int leftIndex=leftChild(pi);
            int rightIndex=rightChild(pi);

            if(leftIndex>=arr.size() && rightIndex>=arr.size()){
                return;
            }
            int minIndex=pi;
            if(leftIndex < arr.size() && arr.get(minIndex)>arr.get(leftIndex)){
                minIndex=leftIndex;
            }
            if(rightIndex < arr.size() && arr.get(minIndex)>arr.get(rightIndex)){
                minIndex=rightIndex;
            }

            if(minIndex==pi){
                return;
            }else{
                swap(pi,minIndex);
                downheapify(minIndex);
            }
        }
        public void remove(){
            if(arr.size()==0){
                //throw Exception
                return;
            }
            swap(0,arr.size()-1);
            arr.remove(size()-1);
            downheapify(0);
        }
    }

public class MyPQ{
    public static void main(String[] args) throws Exception {
        MyPriorityQueue pq=new MyPriorityQueue();
        //minheap
        pq.add(12);
        pq.add(13);
        pq.add(14);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());

        //maxheap
        // pq.add(-1*12);
        // pq.add(-1*13);
        // pq.add(-1*14);
        // System.out.println(-1*pq.peek());
        // pq.remove();
        // System.out.println(-1*pq.peek());
    }
}