package LINKED_LISTS;
import java.util.LinkedList;

public class InbuiltList {
    public static void main(String[] args) {
        LinkedList<Integer> LL=new LinkedList();
        //crud operations

        LL.addFirst(23);
        LL.addFirst(43);
        LL.addFirst(63);
        LL.addLast(100);
        LL.removeFirst();
        LL.removeLast();
        System.out.println(LL);

        System.out.println(LL.get(1));
        LL.add(2,10);
        LL.set(2,10);
        System.out.println(LL);
    }
}
