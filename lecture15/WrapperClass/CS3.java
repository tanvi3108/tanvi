package lecture15.WrapperClass;

public class CS3 {
    public static void main(String[] args) {
        Integer a=new Integer(12);
        Integer b=new Integer(12);   // sabke address alag create honge, so none would be equal

        Integer c=500;
        Integer d=500;

        if(a==b){
            System.out.println("same");
        }
        else{
            System.out.println("aint same");
        }
        if(c==d){
            System.out.println("same");
        }
        else{
            System.out.println("aint same");
        }
    }
}
