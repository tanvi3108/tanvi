package lecture04;
public class Functions{

    static void printsquare(int n){
        System.out.println("SQUARE\n");

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++)
            System.out.print("* ");
            System.out.println();
    }
}
    
     static void printRFT(int n){
        System.out.println("RIGHT FACING TRIANGLE\n");

        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
     }

     static void printLFT(int n){
        System.out.println("LEFT FACING TRIANGLE\n");

        for(int i=1;i<=n;i++){

            //for printing spaces
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");

            //for printing stars
            for(int j=1; j<=i; j++)
            System.out.print("* ");
            System.out.println();

       }
     }

     static void printIRFT(int n){
        System.out.println("INVERTED RIGHT FACING TRIANGLE\n");

        for(int i=n;i>=1;i--){
            for(int j=1; j<=i;j++)
            System.out.print("* ");
            System.out.println();
       }
     }

     static void printILFT(int n){
        System.out.println("INVERTED LEFT FACING TRIANGLE\n");

        for(int i=n;i>=1;i--){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j=1; j<=i; j++)
            System.out.print("* ");
            System.out.println();
    }
     }

     static void printQ6(int n){
        System.out.println("PDF QUES 6\n");

        for(int i=n;i>=1;i--){
            for(int k=1; k<=2*(n-i);k++)
                    System.out.print("  ");
                    for(int j=1; j<=i; j++)
                    System.out.print("* ");
                    System.out.println();
             }
     }

     static void printHollowSquare(int n){
        System.out.println("HOLLOW SQUARE\n");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||i==1||j==1||j==n){
                System.out.print("* ");        
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     }

     static void printDiagonals(int n){
        System.out.println("DIAGONALS\n");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||j==(n-i+1)){
                System.out.print("* ");        
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        int n=5;

        printRFT(n);
        printLFT(n);
        printIRFT(n);
        printILFT(n);
        printQ6(n);
        printHollowSquare(n);
        printDiagonals(n);

    }
}
