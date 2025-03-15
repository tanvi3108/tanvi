package LINKED_LISTS;

class node{
    int data;
    node next;//a reference variable which stores address of next node

    node(int data){
        this.data=data;
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        node n1=new node(13);
        node n2=new node(14);
        node n3=new node(15);
        node n4=new node(16);

        n1.next=n2;//do objects ke beech mei link create hogya is line se
        n2.next=n3;
        n3.next=n4;

        node head=n1;//n1 ka hi doosra name bangya

        node temp=head;
        //temp=head.next;
        temp=temp.next;
        temp=temp.next;
        
    }
}
