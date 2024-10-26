package lecture07;

public class KadaneAlgo {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0) 
                currSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
      int nums[]={5,4,-1,7,8};
      System.out.println(maxSubArray(nums)); 
    }
}

