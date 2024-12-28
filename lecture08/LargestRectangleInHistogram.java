package lecture08;
public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) { 
            int[] nsr= NSR(heights); 
            int[] nsl= NSL(heights); 
            int ans=0; 
                for(int i=0;i<heights.length;i++){ 
                    int width= nsr[i]-nsl[i]-1; 
                    ans= Math.max(ans, width*heights[i]); 
                    } 
            return ans; 
            } 
    
            static int[] NSL(int[] arr) {
                int shorter = -1;
                int[] temp = new int[arr.length];
                for (int i = 0; i < arr.length - 1; i++) {
                    temp[i] = shorter;
                    // if (i < arr.length - 1) {
                    for (int j = i; j >= 0; j--) {
                        if (arr[j] < arr[i + 1]) {
                            shorter = j;
                            temp[i + 1] = shorter;
                            break;
                        } else {
                            shorter = -1;
                        }
                    }
                    // }
                }
                return temp;
            }
    
            static int[] NSR(int[] arr) {
                int shorter = arr.length;
                int[] temp = new int[arr.length];
                for (int i = arr.length - 1; i > 0; i--) {
                    temp[i] = shorter;
                    // if (i > 0) {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] < arr[i - 1]) {
                            shorter = j;
                            temp[i - 1] = shorter;
                            break;
                        } else {
                            shorter = arr.length;
                        }
                    }
                    // }
                }
                return temp;
            }
    
            public static void main(String[] args) {
                int[] heights={2,1,5,6,2,3};
                System.out.println(largestRectangleArea(heights));
        }
}
