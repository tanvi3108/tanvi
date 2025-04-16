package PQ;

import java.util.PriorityQueue;

public class Q1 {

    public static int getTotalCost(int[]arr){
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int val: arr){
            pq.add(val);
        }

        int cost=0;
        while(pq.size()>1){
            int rope1=pq.remove();
            int rope2=pq.remove();
            int currCost=rope1+rope2;
            cost+=currCost;
            pq.add(rope1+rope2);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,6};
        System.out.println(getTotalCost(arr));
    }
}
