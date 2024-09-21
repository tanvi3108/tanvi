package lecture04;

public class Patternprinting {
    public static void main(String[] args) {
      
        int n=5;
        System.out.println("SQUARE\n");
            for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++)
            System.out.print("* ");
            System.out.println();

        }
    

        System.out.println("RIGHT FACING TRIANGLE\n");
            for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
      
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


        System.out.println("INVERTED RIGHT FACING TRIANGLE\n");
            for(int i=n;i>=1;i--){
            for(int j=1; j<=i;j++)
            System.out.print("* ");
            System.out.println();
       }

        System.out.println("INVERTED LEFT FACING TRIANGLE\n");
         for(int i=n;i>=1;i--){
                for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
                for(int j=1; j<=i; j++)
                System.out.print("* ");
                System.out.println();
        }


        System.out.println("PDF QUES 6\n");
            for(int i=n;i>=1;i--){
            for(int k=1; k<=2*(n-i);k++)
                    System.out.print("  ");
                    for(int j=1; j<=i; j++)
                    System.out.print("* ");
                    System.out.println();
             }

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
    
}
