package lecture22; 
import lecture22.LinkedList.Node;
public class Implementation {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        // System.out.println(ll);
        // ll.root.fun();
        // // System.out.println(ll.root);

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.display();
        System.out.println(ll.removeFirst());
        System.out.println(ll.addFirst());
    }
}
