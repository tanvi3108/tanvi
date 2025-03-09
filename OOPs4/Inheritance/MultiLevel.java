package OOPs4.Inheritance;
class shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}
class equilateralTriangle extends triangle{
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        
    }
}
