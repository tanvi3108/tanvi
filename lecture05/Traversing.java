package lecture05;

public class Traversing {
   
    public static void main(String[] args) {
        int[] arr=new int[20];

        //Populating the array
      arr[0] = 1254;
      arr[1] = 1458;
      arr[2] = 5687;
      arr[3] = 1457;
      arr[4] = 4554;
      arr[5] = 5445;
      arr[6] = 7524;

        // for(int i=1;i<=10;i++){
        // System.out.println(i);

        for(int i: arr) 
          System.out.println(i+" ");
        
        }
    }
    

