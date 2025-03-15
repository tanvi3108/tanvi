package LINKED_LISTS;

class MyLL {
    node head=null;

    public void insertAtBegin(int val){
        node newNode=new node(val);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtEnd(int val){

    }
    public void deleteAtBegin(){

    }
    public void deleteAtEnd(){

    }
}

public class MyLinkedList{
    public static void main(String[] args) {
        MyLL list=new MyLL();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.display();
    }
}
