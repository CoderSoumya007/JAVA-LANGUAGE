
public class llusingstack{
    public  Node head;
    public  Node tail;
    public static void main(String[] args) {
        llusingstack ll=new llusingstack();
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(8);
        ll.insert(10);
        ll.insert(13);
        ll.display();
        // ll.delete();
        // ll.delete();
        // ll.display();
        ll.reverse();
        ll.display();
    }
    public void insert(int value){
        Node node=new Node(value);
        if (head==null) {
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public void delete(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        else{
            head=head.next;
        }
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            }
            head=prev;
            }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
 class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}