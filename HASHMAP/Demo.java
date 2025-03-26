package HASHMAP;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap();
        //key= String, value=Integer

        //insert data
        //jis order mei data insert hua h, zaruri nhi usi order mei print hoga 
        hm.put("Aman",40);
        hm.put("Rahul",45);
        hm.put("Akash",50);
        System.out.println(hm);//prints the values instead of address, because of toString();

        //access/read
        System.out.println(hm.get("Aman"));//key ke respect mei uski valude deta h
        System.out.println(hm.get("Akash"));
        System.out.println(hm.get("Ajit"));//returns null
        System.out.println(hm.getOrDefault("Aman",-1));//hashmap mei present h isliye default(initialized) value dega
        System.out.println(hm.getOrDefault("Ajit",-1));//hashmap mei present nhi h isliye corresponding value dega

        hm.remove("Aman");

        
    }
}
