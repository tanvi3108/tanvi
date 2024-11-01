package lecture07;

public class KadaneAlgo {
    static int maxSubArraySum_BruteForce(int[]nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                max=Math.max(max, sum);
            }
        }
        return max;
    }

    static int maxSubArraySum_Better(int[]nums){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currSum=0;
            for(int j=i;j<nums.length;j++){
                    currSum+=nums[j];
                }
                maxSum=Math.max(maxSum, currSum);
            }
        return maxSum;
        }
    
    static int maxSubArraySum_Optimal(int[]nums){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    
   public static void main(String[] args) {
   int nums[]={5,4,-1,7,8};
   System.out.println(maxSubArraySum_BruteForce(nums));
   System.out.println(maxSubArraySum_Better(nums));
   System.out.println(maxSubArraySum_Optimal(nums));

   }
}

