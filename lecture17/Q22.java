package lecture17;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
        generateParenthesis(n,0,0,"",arr);
        return arr;
    }
    public static void generateParenthesis(int n,int l,int r,String ans,List<String>arr){
        if(n==l && l==r){
            arr.add(ans);
            return;
        }
        if(l>n || r>l){
            return;
        }
        generateParenthesis(n,l+1,r,ans+"(",arr);
        generateParenthesis(n,l,r+1,ans+")",arr);
    }
    public static void main(String[] args) {
        int n=3;
        
    }
}
