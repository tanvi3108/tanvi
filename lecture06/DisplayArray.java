package lecture06;
public class DisplayArray {
    
    //for each loop
    static void display(int[]arr){
        for(int i:arr)
        System.out.println(i+" ");
    }
    
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        display(arr);
    }
    
}
