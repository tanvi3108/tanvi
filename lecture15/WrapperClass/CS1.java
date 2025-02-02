package lecture15.WrapperClass;

public class CS1 {
    //casestudy-1
    public static void update(Integer a){
        a++;
    }
    public static void main(String[] args) {
        Integer a=13;
        System.out.println(a);
        update(a);
        System.out.println(a);

        //no update since wrapper classes are immutable
    }
}
