package lecture03;
public class Loops{
    public static void main(String[] args) {
        
        // FOR LOOP SYNTAX
        // for(initialisation; condition; updation){
        //     process/code
        // }

        //example : WAP to print first 10 natural numbers
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }


        // WHILE LOOP SYNTAX
        // [initialisation]
        // while(condition) {
        //     process/code
        //     updation
        // }

        //example : WAP to print first 10 natural numbers
        int n=1;
        while(n<=10){
            System.out.println(n);
            n++;
        }
    


        // DO WHILE LOOP SYNTAX
        // do{
        //     process/code
        // }
        // while(condition);

        //example : WAP to print first 10 natural numbers
        int r=1;
        do{
            System.out.println(r);
            r++;
        }while(r<=10);

    }
}

