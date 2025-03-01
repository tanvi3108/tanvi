package SampleCode;
public class Try {
    public static int print(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return 1;
        }
        char a=ques.charAt(0);
        int count1=print(ques.substring(1),ans+a);
        print(ques.substring(1),ans);

    }
    public static void main(String[] args) {
        String ques="car";
        print(ques, "");
    }
} 
