package lecture15;

import java.util.ArrayList;

public class Array_lists {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();  //capacity=10 , size=0
        //crud operations
        //CREATE
        arr.add(12); //size=1
        arr.add(13); //size=2
        arr.add(14); //size=3
        System.out.println(arr);

        //READ
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        //UPDATE
        System.out.println(arr.set(0,11));
        System.out.println(arr);

        //DELETE
        arr.remove(2);
        System.out.println(arr);

        

        //arr.size() ----->used to find the size

        //for loop--->iterating through indices
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        //for each loop-----> iterate through values
        for(Integer val : arr){
            System.out.println(val);
        }
    }
}
