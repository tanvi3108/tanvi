package HASHMAP;
import java.util.HashMap;

public class Ques2 {
    public static int pairSum(int[]arr,int target){
        HashMap<Integer, Integer> hm=new HashMap();
        int ans=0;
        for(int i=arr.length-1;i>0;i--){
            int secondVal=target-arr[i];
            if(hm.containsKey(secondVal)){
                int oldFreq=hm.get(secondVal);
                ans+=oldFreq;
            }
            if(hm.containsKey(arr[i])){
                int oldFreq=hm.get(arr[i]);
                hm.put(arr[i],oldFreq+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={6,3,-1,5,2,4,5,6,7,-3,-2};
        System.out.println(pairSum(arr,4));
    }
}
