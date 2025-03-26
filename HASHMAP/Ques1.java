package HASHMAP;
import java.util.HashMap;

public class Ques1 {
    public static void findFreq(int[]arr){
        HashMap<Integer, Integer> hm=new HashMap();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int oldFreq=hm.get(arr[i]);
                hm.put(arr[i],oldFreq+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        //System.out.println(hm.size());
        for(int keys:hm.keySet()){
            System.out.println(keys+"->"+hm.get(keys));
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,2,5,7,7,9};
        findFreq(arr);

    }
}
