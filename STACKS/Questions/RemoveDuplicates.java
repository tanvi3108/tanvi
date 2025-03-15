package STACKS.Questions;
import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicate(String s1) {
        Stack<Character> stk = new Stack<>();

        stk.push(s1.charAt(0));
        String ans = "" + stk.peek();

        for (int i = 1; i < s1.length(); i++) {
            if (stk.peek() != s1.charAt(i)) {
                stk.push(s1.charAt(i));
                ans = ans + stk.peek();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abaaabccb";// ababcb
        System.out.println(removeDuplicate(s1));
    }
}

