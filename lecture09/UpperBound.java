package lecture09;

public class UpperBound {
    public static int upperBound(int []arr, int num){
        int low=0;
        int high= arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid= (high+low)/2;

            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if(num>arr[mid]){
                low=mid+1;
            }
            else if(num<arr[mid]){
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,4,4};
        int num=2;
        System.out.println(upperBound(arr,num));
    }
}
