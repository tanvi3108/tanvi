package lecture04;
import java.util.Scanner;
public class Try {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);

    //  System.out.println("Enter the no. of rows");
    //  int n=sc.nextInt();
    //  System.out.println("Enter the no. of columns");
    //  int m=sc.nextInt();

    int n=4;
    int m=5;
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){
    //         if(i==1||j==1||i==n||i==m){
    //         System.out.print("*");        
    //         }else{
    //             System.out.println(" ");
    //         }
    //     }
    //     System.out.println();


     //solid rectangle
     //rows- outer loops
     //columns- inner loops
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
