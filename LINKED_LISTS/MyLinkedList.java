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
        if(head==null){
           insertAtBegin(val);
           return; 
        }  
        node newNode=new node(val);
        node i=head;
        while(i.next!=null){
            i=i.next;
        }
        i.next=newNode;
    }
    public void deleteAtBegin() throws Exception{
        if(head==null){
            new Exception("List is empty");
        }
        node temp=head.next;
        head.next=null;
        head=temp;
    }
    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
}

public class MyLinkedList{
    public static void main(String[] args) {
        MyLL list=new MyLL();
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);
        //list.display();
        //list.insertAtEnd(10);
        //list.deleteAtBegin();
        list.deleteAtEnd();
        list.display();
    }
}
