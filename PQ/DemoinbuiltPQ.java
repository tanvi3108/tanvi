package PQ;
import java.util.PriorityQueue;

public class DemoinbuiltPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue();

        pq.add(12);//log(n)
        pq.add(14);
        pq.add(16);
        pq.add(19);
        pq.add(29);
        System.out.println(pq.peek());//only reads item with hightest priority-> min heap
        System.out.println(pq.size());
        pq.remove();//only removes item with highest priority-------log(n)
        System.out.println(pq.peek());//O(1)
        //no direct-update operations available, will have to delete and add
        System.out.println();
        System.out.println(pq);

        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
