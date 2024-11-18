package lecture15;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hi");
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.insert(2,"DOGS");
        System.out.println(sb);
        sb.replace(2,6,"I love DSA");
        sb.delete(0,5);
        sb.reverse();
        System.out.println(sb);
    }
}
