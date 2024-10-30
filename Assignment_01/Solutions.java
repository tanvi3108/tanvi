package Assignment_01;
import java.util.Scanner;
public class Solutions {

    static void squarePattern(int n){
        for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<i){
					System.out.print(i+" ");}
				else {
					System.out.print(j+" ");
					}
				}
			System.out.println();
		}
    }

    static void halfPyramidPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void patternNumbersAndStars1(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            }
            if(i < n){
                for(int k = 1 ; k <= n -i ;k++){
                    System.out.print("* " );}
            }
            if(i < n-1){
                for(int m = 1 ;m<=n-i-1 ;m++){
                    System.out.print("* ");}
            }
            System.out.println();

        }
    }

    static void patternNumbersAndStars2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(j>i){
               System.out.print("* ");}
               else{
               System.out.print(j+" ");}
               }
           System.out.println();
       }
    }

    static void patternMountain(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(j);
           }
           for(int j=1;j<=space; j++){
            System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
            System.out.print(j);
           }
           System.out.println();
           space-=2;
        }
    }

    static void patternNumberLadder(int n){
        int num=1;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num+=1;
           }
           System.out.println();
        }
    }

    static void patternTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++) {
                System.out.print("     ");
            }
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+"    ");
                k++;
            }
            if(i>1){
                int m=2*(i-1);
                for(int j=1;j<i;j++){
                    System.out.print(m+"    ");
                    m--;}
            }
        System.out.println();
        }
    }

    static void patternWithZeroes(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j){
                    System.out.print(i+"    ");}
                if(j>1 && j<i){
					System.out.print(0+"    ");}
                /*if(i>1 && i==j){
					System.out.print(i);}
				*/
            }

        System.out.println();}

    }

    static void fibonacciPattern(int n){
        int sum =0;
        int f=0;
		int s=1;
        System.out.println(0);
		for(int i=1;i<n;i++){
			for(int j=1;j<=i+1;j++){
				f=s;
                s=sum;
                sum=f+s;
                System.out.print(sum +" ");}
			System.out.println();
		}

    }

    static void manmohanLovesPattern1(int n){
        for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
					if(i%2!=0){
					   System.out.print(1);}
					else{
						if(j==1 || i==j){
							System.out.print(1);}
						else{
                            System.out.print(0);}
					}
			}
        System.out.println();
		}

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        
        patternNumbersAndStars2(n); //question-1
        System.out.println();
        patternTriangle(n); //question-2
        System.out.println();
        patternNumberLadder(n); //question-3
        System.out.println();
        patternWithZeroes(n); //question-4
        System.out.println();
        fibonacciPattern(n); //question-5
        System.out.println();
        patternMountain(n); //question-6
        System.out.println();
        manmohanLovesPattern1(n); //question-7
        System.out.println();
        patternNumbersAndStars1(n); //question-8
        System.out.println();
        halfPyramidPattern(n); //question-9
        System.out.println();
        squarePattern(n); //question-10
        System.out.println();
    }
}
