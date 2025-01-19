package lecture14;

import java.util.Scanner;

public class ReverseString {
    // public static void main(String[] args)
    // {
    //     String str = "Hello", nstr = "";
    //     char ch;

    //     for (int i = 0; i < str.length(); i++) {
              
    //           // extracts each character
    //         ch = str.charAt(i);
          
    //           // adds each character in
    //         // front of the existing string
    //         nstr = ch + nstr; 
    //     }
      
    //     System.out.println(nstr);
    // }


    public static String reverse(String str) {
		
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans +=str.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    Scanner s= new Scanner(System.in);
	    String str= s.next();
	    String ans= reverse(str);
	    System.out.println(ans);
}
}
