package lecture04;
public class PatternPrintingQues{
//these are the solutions to the pattern printing questions from the pdf

    static void printsquare(int n){
        System.out.println("SQUARE\nquestion-1\n");

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
            System.out.print("* ");
            }
            System.out.println();
    }
}
    static void printRFT(int n){
        System.out.println("RIGHT FACING TRIANGLE\nquestion-2\n");

        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
     }
    static void printIRFT(int n){
        System.out.println("INVERTED RIGHT FACING TRIANGLE\nquestion-3\n");

        for(int i=n;i>=1;i--){
            for(int j=1; j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
       }
     }
     static void printLFT(int n){
        System.out.println("LEFT FACING TRIANGLE\nquestion-4\n");

        for(int i=1;i<=n;i++){

            //for printing spaces
            for(int k=1; k<=(n-i);k++){
            System.out.print("  ");
            }
            //for printing stars
            for(int j=1; j<=i; j++){
            System.out.print("* ");
            }   
            System.out.println();

       }
     }

     

     static void printILFT(int n){
        System.out.println("INVERTED LEFT FACING TRIANGLE\nquestion-5\n");

        for(int i=n;i>=1;i--){
            for(int k=1; k<=(n-i);k++){
            System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("* ");
            }
            System.out.println();
    }
     }

     static void printQ6(int n){
        System.out.println("pdf ques-6\n");

        for(int i=n;i>=1;i--){
            for(int k=1; k<=2*(n-i);k++)
            System.out.print("  ");
            for(int j=1; j<=i; j++)
            System.out.print("* ");
            System.out.println();
             }
     }

     static void printQ7(int n){
        System.out.println("pdf ques-7\n");

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

     static void printQ8(int n){
        System.out.println("pdf ques-8\n");

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

     static void printQ9(int n){
        System.out.println("pdf ques-9\n");
        for(int i=1;i<=n;i++){
            //for printing spaces
            for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
            //For printing stars
            for(int j=1;j<=i;j++)
                System.out.print("* ");

            // For RFT
            for(int j=2;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        } 
        // for(int i=0;i<n;i++){
        //     //spaces
        //     for(int j=0;j<n-i-1;j++){
        //     System.out.print("  ");
        //     }
        //     //stars
        //     for(int j=0;j<2*i+1;j++){
        //     System.out.print("* ");
        //     }
        //     //spaces
        //     for(int j=0;j<n-i-1;j++){
        //     System.out.print("  ");
        //     }
        //  System.out.println();
        // }
     }

     static void printQ10(int n){
        System.out.println("pdf ques-10\n");
        for(int i=n;i>=1;i--){
            //for printing spaces
            for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
            //For printing stars
            for(int j=1;j<=i;j++)
                System.out.print("* ");

            // For RFT
            for(int j=2;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        // for(int i=0;i<n;i++){
        //     //spaces
        //     for(int j=0;j<i;j++){
        //     System.out.print("  ");
        //     }
        //     //stars
        //     for(int j=0;j<2*n-(2*i+1);j++){
        //     System.out.print("* ");
        //     }
        //     //spaces
        //     for(int j=0;j<i;j++){
        //     System.out.print("  ");
        //     }
        //  System.out.println();
        // }
     }

     static void printQ11(int n){
        System.out.println("pdf ques-11");

     }
    public static void main(String[] args) {
        int n=5;

        printsquare(n);
        printRFT(n);
        printIRFT(n);
        printLFT(n);
        printILFT(n);
        printQ6(n);
        printQ7(n);
        printQ8(n);
        printQ9(n);
        printQ10(n);

    }
}
