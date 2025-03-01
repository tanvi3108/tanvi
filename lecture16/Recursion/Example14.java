package lecture16.Recursion;

public class Example14 {
    //print all subsequences of the given string
    public static void subSeq(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char a=s.charAt(0);
        subSeq(s.substring(1),ans+a);//include a
        subSeq(s.substring(1),ans);//didn't include a
    }
    public static void main(String[] args) {
        subSeq("abc","");
    }
}
