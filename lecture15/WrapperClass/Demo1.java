package lecture15.WrapperClass;

public class Demo1 {
    public static void main(String[] args) {
        int a=5;
        //Integer a=new Integer(5);-------------depreciated now
        Integer a1=5;
        System.out.println(a1);  // this will print the value in a1

        int b=12;
        Integer c=b;  //autoboxing---> conversion from primitive data type to the corresponding wrapper class is possible
        //Integer c=Integer.valueOf(b);   ---->internal working of above line
        System.out.println(c);

        //unboxing--> convertion from wrapper class to corresponding primitive data type is possible
        int d=c;
        //int d=c.intValue();   ---->internal working of above line
        System.out.println(d);

    }
}
