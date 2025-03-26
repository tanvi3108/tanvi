package HASHMAP;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap();
        hm.put("Aman",10);
        hm.put("Ajit",30);
        hm.put("Alok",30);

        hm.put("Aman",50);//data update hogya->override
        //add tb krega jb new entry ho
        //update karega jb new entry na ho
        //keys can never be repeated, all the keys are unique in nature in hashmap

        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        //hashmap ko traverse krke print krna ho to
        for(String keys:hm.keySet()){
            System.out.println(keys+" "+hm.get(keys));  //key ke respect mei----most important
        }
        for(Integer values:hm.values()){
            System.out.println(values);      //values ke respect mei
        }
        for(Map.Entry<String,Integer>entry: hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());    //dono ke respect mei
        }



        //searching
        System.out.println(hm.containsKey("Aman"));
    }
}
