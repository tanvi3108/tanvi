package SampleCode;

public class Try {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++) {
                System.out.print("     ");}
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+"    ");
                k++;}

            if(i>1){
                int m=2*(i-1);

                for(int j=1;j<i;j++){
                    System.out.print(m+"    ");
                    m--;}
            }
        System.out.println();

        }
        }
    }

