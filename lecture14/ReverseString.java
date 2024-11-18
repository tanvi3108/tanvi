package lecture14;

public class ReverseString {
    public static void main(String[] args)
    {
        String str = "Hello", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
              
              // extracts each character
            ch = str.charAt(i);
          
              // adds each character in
            // front of the existing string
            nstr = ch + nstr; 
        }
      
        System.out.println(nstr);
    }
}
