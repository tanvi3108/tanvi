package lecture17;

public class SubSequences {
    //subsequences->should be a part of the string, needn't be continuous
    public static void printPermutations(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<=ques.length();i++){
            char a=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            printPermutations(s1+s2,ans+a);
        }
    }
    public static void generateParenthesis(int n,int l,int r,String ans){
        if(n==l && l==r){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l){
            return;
        }
        generateParenthesis(n,l+1,r,ans+"{");
        generateParenthesis(n,l,r+1,ans+"}");
    }
    public static void coinToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1,ans+"H");
        coinToss(n-1,ans+"T");
    }
    public static int countcoinToss(int n,String ans){
        if(n==0){
            return 1;
        }
        int H=countcoinToss(n-1,ans+"H");
        int T=countcoinToss(n-1,ans+"T");

        return H+T;
    }
    public static void printsubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char a=ques.charAt(0);
        //include
        printsubSeq(ques.substring(1),ans+a);
        //don't include
        printsubSeq(ques.substring(1),ans);
    }
    public static int countsubSeq(String ques,String ans){
        if(ques.length()==0){
            return 1;
        }
        char a=ques.charAt(0);
        //include
        int inc= countsubSeq(ques.substring(1),ans+a);
        //don't include
        int ninc= countsubSeq(ques.substring(1),ans); 

        return inc+ninc;
    }

    public static void main(String[] args) {
        String ques="car";
        printsubSeq(ques, "");

        int n=3;
        coinToss(n,"");

        System.out.println(countsubSeq(ques,""));

        System.out.println(countcoinToss(n,""));

        generateParenthesis(3, 0, 0,"");

        printPermutations("abc","");
    }
}
